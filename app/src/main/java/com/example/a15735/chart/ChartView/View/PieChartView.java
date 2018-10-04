package com.example.a15735.chart.ChartView.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.example.a15735.chart.ChartView.CharBean;

import java.util.List;
//还没写完
public class PieChartView extends View {
    private int centerwith;
    private int centheight;
    private int radius;
    private Paint mpiepaint;
    private List<CharBean> charBeans;
    private int color;
    float arcstar = 0, arcvlue = 0, setvalue = 0, totle = 0, sun = 0;

    public PieChartView(Context context) {
        this(context, null);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initpaint();
    }


    private void initpaint() {
        mpiepaint = new Paint();
        mpiepaint.setAntiAlias(true);
        mpiepaint.setDither(true);
        mpiepaint.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        centerwith = w / 2;
        centheight = h / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(centerwith,centheight);
        radius = (Math.min(centerwith, centheight));
        Log.d("xxe", centerwith + "");
        Log.d("xxg", centheight + "");
        RectF rect = new RectF(-radius, -radius, radius, radius);//幕布
        int a = charBeans.size();
        //总长度
        for (int i = 0; i < a; i++) {
            CharBean charBean = charBeans.get(i);
            totle = charBean.vlue + totle;
        }
        Log.d("xxD", totle + "");
        for (int i = 0; i < a; i++) {
            CharBean charBean = charBeans.get(i);
            //获取颜色
            color = charBean.color;
            //设置画笔颜色
            mpiepaint.setColor(color);
            //获取数值
            setvalue = charBean.vlue;
            Log.d("xxC", setvalue + "");
//            //初始角度
            arcstar = arcstar + arcvlue;
            arcstar = i * arcvlue;
            Log.d("xxh", arcstar + "");
            sun = setvalue / totle;
//            //扫描角度
            arcvlue = sun * 360;
            canvas.drawArc(rect, arcstar, arcvlue, true, mpiepaint);

        }
        //重置 Activtyrestar后 会出现重新绘制的情况
        reset();
    }

    public void reset() {
        arcstar = 0;
        arcvlue = 0;
        setvalue = 0;
        totle = 0;
        sun = 0;

    }



    public void setdata(List<CharBean> data) {
        this.charBeans = data;
        Log.d("xxx", data.size() + "");
    }


}
