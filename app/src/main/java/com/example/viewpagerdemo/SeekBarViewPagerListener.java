package com.example.viewpagerdemo;

import android.util.Log;
import android.widget.SeekBar;

import androidx.viewpager.widget.ViewPager;

public class SeekBarViewPagerListener implements SeekBar.OnSeekBarChangeListener {

    private ViewPager mViewPager;
    private int maxOffset;
    private int curOffset;

    public SeekBarViewPagerListener(ViewPager viewPager) {
        this.mViewPager = viewPager;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
           if (mViewPager.isFakeDragging()){
               int offset= (int) ((maxOffset/100.0)*progress);
               int dragBy=-1*(offset-curOffset);
               mViewPager.fakeDragBy(dragBy);
               curOffset=offset;
           }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
            Log.d("SeekBarViewPagerListene", "mViewPager.getChildCount():" + mViewPager.getChildCount());
             maxOffset=mViewPager.getWidth()*3;
             Log.d("SeekBarViewPagerListene", "mViewPager.getWidth():" + mViewPager.getWidth());
             mViewPager.beginFakeDrag();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        mViewPager.beginFakeDrag();
        curOffset=0;
        seekBar.setProgress(0);
    }
}
