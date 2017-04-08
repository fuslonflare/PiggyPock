package com.kmitl.meeserclenote.pigpock.fragment;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.kmitl.meeserclenote.pigpock.R;
import com.kmitl.meeserclenote.pigpock.adapter.HopeAdapter;
import com.kmitl.meeserclenote.pigpock.dao.HopeDao;

import java.util.ArrayList;




/**
 * Created by nuuneoi on 11/16/2014.
 */
public class SummaryFragment extends Fragment {

    private PieChart mChart;

    public SummaryFragment() {
        super();
    }

    public static SummaryFragment newInstance() {
        SummaryFragment fragment = new SummaryFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_summary, container, false);
        initInstances(rootView);

        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        mChart = (PieChart) rootView.findViewById(R.id.pieChart);
        mChart.getDescription().setEnabled(false);

//        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Light.ttf");
//
//        mChart.setCenterTextTypeface(tf);
//        mChart.setCenterText(generateCenterText());
//        mChart.setCenterTextSize(10f);
//        mChart.setCenterTextTypeface(tf);

        // radius of the center hole in percent of maximum radius
        mChart.setHoleRadius(20f);
        mChart.setHoleColor(Color.TRANSPARENT);
        mChart.setTransparentCircleRadius(25f);


        Legend l = mChart.getLegend();
        l.setEnabled(false);
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);

        mChart.setData(generatePieData());

        ArrayList<HopeDao> hope = new ArrayList<>();
        hope.add(new HopeDao("English Course", 5300, 5500));
        hope.add(new HopeDao("Buy new watch", 3500, 4000));
        hope.add(new HopeDao("Go to Japan", 12000, 15000));

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerHopeList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new HopeAdapter(hope);
        recyclerView.setAdapter(adapter);
    }

    protected PieData generatePieData() {

        //int count = 4;

        ArrayList<PieEntry> entries1 = new ArrayList<>();

        entries1.add(new PieEntry(3000, "Don't poor"));
        entries1.add(new PieEntry(16500, "Be alive"));
        entries1.add(new PieEntry(3000, "Don't silly"));
        entries1.add(new PieEntry(3000, "Just need"));
        entries1.add(new PieEntry(3000, "Follow dream"));
        entries1.add(new PieEntry(1500, "Don't covet"));

        PieDataSet ds1 = new PieDataSet(entries1, "");

        ds1.setColors(ColorTemplate.MATERIAL_COLORS);
        ds1.setSliceSpace(2f);
        ds1.setValueTextColor(Color.WHITE);
        ds1.setValueTextSize(13f);


        PieData d = new PieData(ds1);
        //d.setValueTypeface(tf);



        return d;
    }


    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }
}
