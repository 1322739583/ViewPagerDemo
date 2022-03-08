package com.example.viewpagerdemo.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.viewpagerdemo.R;


import java.util.List;

public class Adapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public Adapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, String item) {
        TextView textView = helper.itemView.findViewById(R.id.text);
        textView.setText(item);
    }
}
