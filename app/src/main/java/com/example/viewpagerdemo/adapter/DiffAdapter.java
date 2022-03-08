package com.example.viewpagerdemo.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DiffAdapter extends RecyclerView.Adapter<DiffAdapter.DiffVH> {
    @NonNull
    @Override
    public DiffVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DiffVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public class DiffVH extends RecyclerView.ViewHolder {
        public DiffVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
