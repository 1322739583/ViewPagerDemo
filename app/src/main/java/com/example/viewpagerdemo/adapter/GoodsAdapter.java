package com.example.viewpagerdemo.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.viewpagerdemo.bean.Goods;

import java.util.List;

public class GoodsAdapter extends BaseQuickAdapter<List<Goods>, BaseViewHolder> {
    public GoodsAdapter(int layoutResId, @Nullable List<List<Goods>> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, List<Goods> item) {

    }


}
