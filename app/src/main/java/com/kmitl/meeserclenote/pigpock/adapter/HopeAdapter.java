package com.kmitl.meeserclenote.pigpock.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kmitl.meeserclenote.pigpock.R;
import com.kmitl.meeserclenote.pigpock.dao.HopeDao;
import com.kmitl.meeserclenote.pigpock.view.CustomTextView;

import java.util.ArrayList;

/**
 * Created by Phuwarin on 4/7/2017.
 */

public class HopeAdapter extends RecyclerView.Adapter<HopeAdapter.ViewHolder> {
    private ArrayList<HopeDao> hope;

    public HopeAdapter(ArrayList<HopeDao> hope) {
        this.hope = hope;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_row_hope, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,
                                 int position) {
        holder.hopeName.setText(hope.get(position).getHopeName());
        holder.hopeCurrent.setText(hope.get(position).getHopeCurrent() + " บาท");
        holder.hopeTarget.setText(hope.get(position).getHopeTarget()+ " บาท");
    }

    @Override
    public int getItemCount() {
        return hope.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CustomTextView hopeName;
        private CustomTextView hopeCurrent;
        private CustomTextView hopeTarget;

        public ViewHolder(View itemView) {
            super(itemView);

            hopeName = (CustomTextView) itemView.findViewById(R.id.text_hope);
            hopeCurrent = (CustomTextView) itemView.findViewById(R.id.text_hope_current);
            hopeTarget = (CustomTextView) itemView.findViewById(R.id.text_hope_target);
        }
    }
}
