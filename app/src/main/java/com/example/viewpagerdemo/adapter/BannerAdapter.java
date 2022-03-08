package com.example.viewpagerdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

public class BannerAdapter extends PagerAdapter {
    private int[] imgs;
    private Context context;
    public BannerAdapter(Context context,int[] imgs) {
       this.imgs=imgs;
       this.context=context;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        Glide.with(context)
//                .load(imgs[position])
//                .into();

        return super.instantiateItem(container, position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
