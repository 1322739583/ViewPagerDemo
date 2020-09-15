package com.example.viewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    Fragment fragment;
    List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        BlankFragment blankFragment = new BlankFragment();
        BlankFragment2 blankFragment2 = new BlankFragment2();
        BlankFragment3 blankFragment3 = new BlankFragment3();
        BlankFragment4 blankFragment4= new BlankFragment4();
        BlankFragment5 blankFragment5= new BlankFragment5();
        fragments = new ArrayList<>();
        fragments.add(blankFragment);
        fragments.add(blankFragment2);
        fragments.add(blankFragment3);
        fragments.add(blankFragment4);
        fragments.add(blankFragment5);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager(), fragments));

    }


}
