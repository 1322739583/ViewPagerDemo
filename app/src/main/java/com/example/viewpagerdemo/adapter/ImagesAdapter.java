package com.example.viewpagerdemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ImagesAdapter extends PagerAdapter {
    private List<String> imgUrls;
    private List<View> viewList;
    private Context context;

    public ImagesAdapter(Context context,List<String> imgUrls) {
        this.imgUrls = imgUrls;
        this.context = context;
        viewList=new ArrayList<>();
    }

    @Override
    public int getCount() {
        return imgUrls.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(context);
        Glide.with(context).load(imgUrls.get(position)).into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).finish();
            }
        });
        container.addView(imageView);
        viewList.add(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(viewList.get(position));
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
