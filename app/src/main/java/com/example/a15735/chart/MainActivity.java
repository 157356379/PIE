package com.example.a15735.chart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a15735.chart.ChartView.CharBean;
import com.example.a15735.chart.ChartView.View.PieChartView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CharBean> mpercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
    }

    private void setData() {
        mpercent = new ArrayList<>();

        CharBean charBean1 = new CharBean();
        CharBean charBean2 = new CharBean();
        CharBean charBean3 = new CharBean();
        CharBean charBean4 = new CharBean();
        CharBean charBean5 = new CharBean();
        CharBean charBean6 = new CharBean();
        charBean1.color = Color.RED;
        charBean2.color = Color.YELLOW;
        charBean3.color = Color.GREEN;
        charBean4.color = Color.BLACK;
        charBean5.color = Color.BLUE;
        charBean6.color = Color.GRAY;
        charBean1.name = "math";
        charBean2.name = "apple";
        charBean3.name = "orange";
        charBean3.name = "orange1";
        charBean3.name = "orange2";
        charBean3.name = "orange3";
        charBean1.vlue = 10;
        charBean2.vlue = 10;
        charBean3.vlue = 10;
        charBean4.vlue = 10;
        charBean5.vlue = 10;
        charBean6.vlue = 10;
        mpercent.add(charBean1);
        mpercent.add(charBean2);
        mpercent.add(charBean3);
        mpercent.add(charBean4);
        mpercent.add(charBean5);
        mpercent.add(charBean6);
//        chartViewHelp.setisinvalidate(false);
        PieChartView pieChartView = findViewById(R.id.test);
       pieChartView.setdata(mpercent);
    }


}
