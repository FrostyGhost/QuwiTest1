package com.android.quwitest.screen.login;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.android.quwitest.R;
import com.android.quwitest.base.NavigationFragment;
import com.android.quwitest.databinding.FragmentLoginBinding;
import com.android.quwitest.models.LoginModel;
import com.android.quwitest.utils.ManagerSharedPreferences;

public class LoginFragment extends NavigationFragment<FragmentLoginBinding> {

    private LoginViewModel viewModel;

    @Override
    protected FragmentLoginBinding bindLayout(LayoutInflater inflater, ViewGroup container) {
        return FragmentLoginBinding.inflate(inflater, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupViewModel();
        setupLoginBtn();
        setupObservers();
    }

    private void setupObservers() {
        viewModel.errorMsg.observe(getViewLifecycleOwner(), errorMsg ->{
            Toast.makeText(requireContext(), errorMsg + "", Toast.LENGTH_SHORT).show();
        });
        viewModel.authStatus.observe(getViewLifecycleOwner(), data ->{
            if (data.getToken() != null){
                ManagerSharedPreferences.getInstance(requireContext()).setAccessToken(data.getToken());
                navigate(R.id.chatListFragment);
            }
        });
    }

    private void setupViewModel() {
        viewModel = new LoginViewModel();
    }

    private void setupLoginBtn() {
        binding.btnLogin.setOnClickListener(view -> {
            if (isDataValid()){
                viewModel.login(new LoginModel(
                        binding.etPassword.getText().toString(),
                        binding.etEmail.getText().toString()));
            }
        });
    }

    private Boolean isDataValid(){
        return validateEmail() && validatePass();
    }

    private boolean validatePass(){
        if (binding.etPassword.getText().toString().equals("")
                || binding.etPassword.getText().toString().length() <= 3 ){
            Toast.makeText(requireContext(), R.string.not_valid_password, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    };

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    private boolean validateEmail(){
        if (binding.etEmail.getText().toString().equals("")
                || !isValidEmail(binding.etEmail.getText().toString())){
            Toast.makeText(requireContext(), R.string.not_valid_email, Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}
