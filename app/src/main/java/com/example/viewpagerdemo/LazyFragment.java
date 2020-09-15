package com.example.viewpagerdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class LazyFragment extends Fragment {
    private View rootView;
    private boolean isViewCreated = false;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (isViewCreated) {
            if (rootView == null) {
                inflater.inflate(getLayoutRes(), container, false);
            }
        }
        initView(rootView);
        isViewCreated = true;
        return rootView;
    }

    protected abstract int getLayoutRes();

    protected abstract void initView(View rootView);

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            dispatchUserVisibleHint(true);
        } else {
            dispatchUserVisibleHint(false);
        }
    }

    private void dispatchUserVisibleHint(boolean isVisible) {
        if (isVisible) {
            onFragmentLoad();
        } else {
            onFragmentStop();
        }
    }

    protected void onFragmentLoad() {

    }

    protected void onFragmentStop() {

    }


}
