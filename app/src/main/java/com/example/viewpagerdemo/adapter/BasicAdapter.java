package com.example.viewpagerdemo.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.viewpagerdemo.R;

import java.util.List;

/**
 * 最简单的适配器实现
 */
public class BasicAdapter extends PagerAdapter {

    private List<String> mDatas;
    private Context mContext;
     public BasicAdapter(Context context,List<String> datas) {
        this.mContext=context;
        this.mDatas=datas;

    }

    /**
     *
     * @param container  就是ViewPager,通过打印可以直接看到
     * @param position
     * @return
     */
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


           View  pageView = View.inflate(mContext, R.layout.viewpager_item, null);


//        Log.d("BasicAdapter instantia", "view:" + pageView);
        TextView textView = pageView.findViewById(R.id.textview);
        textView.setText(mDatas.get(position));
        container.addView(pageView);
        pageView.setTag("page"+position);


        return pageView;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        Log.d("BasicAdapter isViewFrom", "view:" + view);
        return view==object;
    }
}
