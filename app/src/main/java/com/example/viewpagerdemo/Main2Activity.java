package com.example.viewpagerdemo;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.viewpagerdemo.adapter.Adapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Main2Activity extends AppCompatActivity {


    @BindView(R.id.recycler)
    RecyclerView recycler;

    List<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        for (int i = 0; i <20 ; i++) {
            data.add("item"+i);
        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new Adapter(R.layout.activity_main2_item, data));
    }


}
