package com.example.viewpagerdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.example.viewpagerdemo.adapter.BasicAdapter;
import com.example.viewpagerdemo.pagetransform.AlphaTransform;

import java.util.ArrayList;
import java.util.List;

/**
 * 最基本的ViewPager使用
 */
public class BasicActivity extends AppCompatActivity {

    private NoScrollViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        List<String> datas=new ArrayList<>();
        datas.add("Page1");
        datas.add("Page2");
        datas.add("Page3");

        viewPager = findViewById(R.id.viewPager);
        SeekBar seekBar=findViewById(R.id.seekbar);
        seekBar.setEnabled(true);
       seekBar.setOnSeekBarChangeListener(new SeekBarViewPagerListener(viewPager));
        //文档的意思是这个方法可以屏蔽在滑动过程的touch事件
        //必须在setAdapter之前调用
//        viewPager.beginFakeDrag();
//        viewPager.fakeDragBy(100);
//        viewPager.endFakeDrag();
        viewPager.setAdapter(new BasicAdapter(this,datas));
        viewPager.setPageTransformer(true,new AlphaTransform());

    }

    boolean isClicked=false;
    public void scrollToPage2(View view) {
        if (!isClicked) {
            viewPager.setCurrentItem(2,false);
            isClicked=true;
        }else {
            viewPager.setCurrentItem(0,false);
            isClicked=false;
        }
    }
}
