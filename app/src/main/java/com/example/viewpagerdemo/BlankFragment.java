package com.example.viewpagerdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpagerdemo.adapter.Adapter;
import com.example.viewpagerdemo.adapter.ImageAdapter;
import com.google.android.material.snackbar.Snackbar;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.util.LogUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends LazyFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    Banner banner;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    RecyclerView recycler;

    List<String> data;

    private int[] imgs = new int[]{
            R.mipmap.banner1, R.mipmap.banner2, R.mipmap.banner3
    };


    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BlankFragment", "getContext():" + getContext());


        Log.d("BlankFragment1", "onCreate");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        Log.d("BlankFragment1", "onCreateView");
//        return inflater.inflate(R.layout.fragment_blank, container, false);
//    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_blank;
    }

    @Override
    protected void initView(View rootView) {
        //  ViewPager vpBanner = rootView.findViewById(R.id.vpBanner);

        banner=rootView.findViewById(R.id.banner);
        recycler=rootView.findViewById(R.id.recyclerView);

        ImageAdapter adapter = new ImageAdapter(DataBean.getTestData2());

        banner.setAdapter(adapter)
                .addBannerLifecycleObserver(this)//添加生命周期观察者
                .setIndicator(new CircleIndicator(getContext()))//设置指示器
                .setOnBannerListener((data, position) -> {
                    Snackbar.make(banner, ((DataBean) data).title, Snackbar.LENGTH_SHORT).show();
                    LogUtils.d("position：" + position);
                });

        data=new ArrayList<>();

        for (int i = 0; i <20 ; i++) {
            data.add("item"+i);
        }

        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(new Adapter(R.layout.activity_main2_item, data));

        //vpBanner.setAdapter(new BannerAdapter(getContext(),imgs));
    }

    @Override
    protected void onFragmentLoad() {
        Log.d("BlankFragment1", "更新数据");
    }

    @Override
    protected void onFragmentStop() {
        Log.d("BlankFragment1", "停止加载数据");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BlankFragment1", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BlankFragment1", "onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BlankFragment1", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BlankFragment1", "onDestroyView");
    }
}
