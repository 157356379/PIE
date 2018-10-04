package com.example.a15735.chart.ChartView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ChartViewLayout extends RelativeLayout {
    public ChartViewLayout(Context context) {
       this(context,null);
    }

    public ChartViewLayout(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public ChartViewLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


}
