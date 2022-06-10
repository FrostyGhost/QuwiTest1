package com.android.quwitest.screen.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.android.quwitest.R;
import com.android.quwitest.base.NavigationFragment;
import com.android.quwitest.databinding.FragmentHomeBinding;

public class HomeFragment extends NavigationFragment<FragmentHomeBinding> {

    @Override
    protected FragmentHomeBinding bindLayout(LayoutInflater inflater, ViewGroup container) {
        return FragmentHomeBinding.inflate(inflater, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupClickListeners();
    }

    private void setupClickListeners() {
        binding.btnLogin.setOnClickListener((v)->navigate(R.id.authFragment));
        binding.bntRegistration.setOnClickListener((v)->navigate(R.id.registrationFragment));
    }

}
