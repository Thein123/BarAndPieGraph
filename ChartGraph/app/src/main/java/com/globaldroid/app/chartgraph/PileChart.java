package com.globaldroid.app.chartgraph;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by User on 1/23/2018.
 */
public class PileChart extends Fragment {

    PieChart pieChart ;
    ArrayList<Entry> entries ;
    ArrayList<String> pileLabel ;
    PieDataSet pieDataSet ;
    PieData pieData ;

    public PileChart() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pile_chart, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        pieChart = (PieChart)getActivity().findViewById(R.id.chart1);

        entries = new ArrayList<>();

        pileLabel = new ArrayList<String>();

        addValues();

        addLabels();

        pieDataSet = new PieDataSet(entries, "");

        pieData = new PieData(pileLabel, pieDataSet);

        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        pieChart.setData(pieData);

        pieChart.animateY(3000);
    }
    public void addValues(){

        entries.add(new BarEntry(2f, 0));
        entries.add(new BarEntry(4f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(8f, 3));
        entries.add(new BarEntry(7f, 4));
        entries.add(new BarEntry(3f, 5));

    }

    public void addLabels(){

        pileLabel.add("January");
        pileLabel.add("February");
        pileLabel.add("March");
        pileLabel.add("April");
        pileLabel.add("May");
        pileLabel.add("June");

    }

}

