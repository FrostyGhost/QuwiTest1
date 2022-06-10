package com.android.quwitest.screen;

import android.os.Bundle;

import com.android.quwitest.R;
import com.android.quwitest.base.BaseActivity;
import com.android.quwitest.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}