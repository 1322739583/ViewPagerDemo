package com.example.viewpagerdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener , ViewPager.OnPageChangeListener {
    ViewPager viewPager;
    List<Fragment> fragments;
    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        setListener();
    }

    private void setListener() {
        viewPager.addOnPageChangeListener(this);
        navView.setOnNavigationItemSelectedListener(this);
    }

    private void initData() {

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

    private void initView() {
        navView = findViewById(R.id.nav_view);
        viewPager = findViewById(R.id.viewPager);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navigation_home:
                viewPager.setCurrentItem(0);
                break;
            case R.id.navigation_dashboard:
                viewPager.setCurrentItem(1);
                break;
            case R.id.navigation_notifications:
                viewPager.setCurrentItem(2);
                break;
            case R.id.navigation_find:
                viewPager.setCurrentItem(3);
                break;
            case R.id.navigation_group:
                viewPager.setCurrentItem(4);
                break;

        }
        return false;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        navView.getMenu().getItem(position).setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
