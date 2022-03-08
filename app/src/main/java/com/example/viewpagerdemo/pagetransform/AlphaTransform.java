package com.example.viewpagerdemo.pagetransform;

import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

public class AlphaTransform implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
           Log.d("AlphaTransform", page.getTag()+" position:" + position);
    }
}
