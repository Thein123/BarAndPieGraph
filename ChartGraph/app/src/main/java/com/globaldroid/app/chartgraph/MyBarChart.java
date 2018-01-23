package com.globaldroid.app.chartgraph;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by User on 1/23/2018.
 */
public class MyBarChart extends Fragment {

    BarChart chart ;
    ArrayList<BarEntry> barData ;
    ArrayList<String> barLabel ;
    BarDataSet bardataset ;
    BarData data ;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.bar_chart, container, false);
            return rootView;
        }

        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);


            chart = (BarChart)getActivity().findViewById(R.id.chart1);

            barData = new ArrayList<>();

            barLabel = new ArrayList<String>();

            AddValuesToBARENTRY();

            AddValuesToBarEntryLabels();

            bardataset = new BarDataSet(barData, "Projects");

            data = new BarData(barLabel, bardataset);

            bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

            chart.setData(data);

            chart.animateY(3000);
        }
    public void AddValuesToBARENTRY(){

        barData.add(new BarEntry(2f, 0));
        barData.add(new BarEntry(4f, 1));
        barData.add(new BarEntry(6f, 2));
        barData.add(new BarEntry(8f, 3));
        barData.add(new BarEntry(7f, 4));
        barData.add(new BarEntry(3f, 5));

    }

    public void AddValuesToBarEntryLabels(){

        barLabel.add("January");
        barLabel.add("February");
        barLabel.add("March");
        barLabel.add("April");
        barLabel.add("May");
        barLabel.add("June");

    }

    }


