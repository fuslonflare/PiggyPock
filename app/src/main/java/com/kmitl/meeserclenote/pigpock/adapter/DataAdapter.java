package com.kmitl.meeserclenote.pigpock.adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.kmitl.meeserclenote.pigpock.R;
import com.kmitl.meeserclenote.pigpock.dao.PocketDao;
import com.kmitl.meeserclenote.pigpock.view.CustomTextView;

import java.util.ArrayList;

/**
 * Created by Phuwarin on 4/7/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<PocketDao> pocket;

    public DataAdapter(ArrayList<PocketDao> pocket) {
        this.pocket = pocket;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,
                                 int position) {
        holder.textPocket.setText(pocket.get(position).getPocketNumber());
        holder.textDescription.setText(pocket.get(position).getPocketName());
        holder.textPercentage.setText(pocket.get(position).getPocketPercentage() + "%");
        holder.textAmount.setText(pocket.get(position).getPocketAmount() + " บาท");
    }

    @Override
    public int getItemCount() {
        return pocket.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CustomTextView textPocket;
        private CustomTextView textDescription;
        private CustomTextView textPercentage;
        private CustomTextView textAmount;

        public ViewHolder(View itemView) {
            super(itemView);

            textPocket = (CustomTextView) itemView.findViewById(R.id.text_pocket);
            textDescription = (CustomTextView) itemView.findViewById(R.id.text_pocket_description);
            textPercentage = (CustomTextView) itemView.findViewById(R.id.text_pocket_percentage);
            textAmount = (CustomTextView) itemView.findViewById(R.id.text_pocket_amount);
        }
    }
}
