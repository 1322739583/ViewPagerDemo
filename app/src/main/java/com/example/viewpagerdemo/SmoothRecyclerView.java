package com.example.viewpagerdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class SmoothRecyclerView extends RecyclerView {
    public SmoothRecyclerView(@NonNull Context context) {
        super(context);
    }

    public SmoothRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SmoothRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
                 switch (ev.getAction()) {
                             case MotionEvent.ACTION_DOWN:
                                 getParent().requestDisallowInterceptTouchEvent(true);
                                 break;
                             case MotionEvent.ACTION_MOVE:
                                 getParent().requestDisallowInterceptTouchEvent(false);
                                 break;
                             case MotionEvent.ACTION_UP:
                                 break;
                             default:
                                 break;
                         }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        return true;
    }
}
