package com.kmitl.meeserclenote.pigpock.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.kmitl.meeserclenote.pigpock.R;
import com.kmitl.meeserclenote.pigpock.activity.SumActivity;
import com.kmitl.meeserclenote.pigpock.adapter.DataAdapter;
import com.kmitl.meeserclenote.pigpock.dao.PocketDao;

import java.util.ArrayList;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class PocketFragment extends Fragment {

    public PocketFragment() {
        super();
    }

    public static PocketFragment newInstance() {
        PocketFragment fragment = new PocketFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pocket, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here

        TextView textView = (TextView) rootView.findViewById(R.id.click);
         textView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(getActivity(),SumActivity.class));
             }
         });

        ArrayList<PocketDao> pocket = new ArrayList<>();
        pocket.add(new PocketDao("กระปุกที่ 1", "กันจน", 55.0, 16500));
        pocket.add(new PocketDao("กระปุกที่ 2", "เหลือเก็บ", 10.0, 3000));
        pocket.add(new PocketDao("กระปุกที่ 3", "ตามฝัน", 10.0, 3000));
        pocket.add(new PocketDao("กระปุกที่ 4", "กันโง่", 10.0, 3000));
        pocket.add(new PocketDao("กระปุกที่ 5", "ฉุกเฉิน", 5.0, 1500));
        pocket.add(new PocketDao("กระปุกที่ 6", "แก้อยาก", 10.0, 3000));

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new DataAdapter(pocket);
        recyclerView.setAdapter(adapter);
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
