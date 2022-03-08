package com.example.viewpagerdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class SmoothScrollView extends ScrollView {
    int lastY;
    public SmoothScrollView(Context context) {
        super(context);
    }

    public SmoothScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SmoothScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if(action == MotionEvent.ACTION_DOWN){
            return false;
        }else {
            return true;
        }
    }


    //    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//             boolean isIntercept=false;
//                switch (ev.getAction()) {
//                            case MotionEvent.ACTION_DOWN:
//                                isIntercept=false;
//                                 super.onInterceptTouchEvent(ev);
//                                break;
//                            case MotionEvent.ACTION_MOVE:
//                                isIntercept=true;
//                                break;
//                            case MotionEvent.ACTION_UP:
//                                isIntercept=false;
//                                break;
//                            default:
//                                break;
//                        }
//        return isIntercept;
//    }

//    @Override
//    public boolean onTouchEvent(MotionEvent ev) {
//           switch (ev.getAction()) {
//                       case MotionEvent.ACTION_DOWN:
//                           lastY = (int) ev.getY();
//                           break;
//                       case MotionEvent.ACTION_MOVE:
//                           int moveY= (int)ev.getY();
//                           int dy=moveY-lastY;
//                           scrollBy(0,-dy);
//                           lastY=moveY;
//                           break;
//                       case MotionEvent.ACTION_UP:
//                           int scrollY= (int) getScaleY();
//                           scrollTo(0,scrollY);
//                           break;
//                       default:
//                           break;
//                   }
//        return true;
//    }
}
