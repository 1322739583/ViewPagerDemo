package com.example.viewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.SeekBar;

import com.example.viewpagerdemo.adapter.BasicAdapter;
import com.example.viewpagerdemo.pagetransform.AlphaTransform;

import java.util.ArrayList;
import java.util.List;

public class AlphaTransformActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_transform);

        List<String> datas=new ArrayList<>();
        datas.add("Page1");
        datas.add("Page2");
        datas.add("Page3");
        datas.add("Page4");

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new BasicAdapter(this,datas));
        viewPager.setPageTransformer(true,new AlphaTransform());
    }
}
