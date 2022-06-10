package com.android.quwitest.base;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

public abstract class NavigationFragment<B extends ViewDataBinding> extends BaseFragment<B> {

    private NavController navController;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(binding.getRoot());
    }

    protected void navigate(int destinationID) {
        try {
            navController.navigate(destinationID);
        } catch (Exception ex) {
            handleNavigationException(ex);
        }
    }

    protected void navigate(NavDirections navDirections) {
        try {
            navController.navigate(navDirections);
        } catch (Exception ex) {
            handleNavigationException(ex);
        }
    }

    protected void navigate(int destinationID, Bundle bundle) {
        try {
            navController.navigate(destinationID, bundle);
        } catch (Exception ex) {
            handleNavigationException(ex);
        }
    }

    private void handleNavigationException(Exception ex) {
        Log.d(getClass().getSimpleName(), ex.toString());
    }

    protected void navigateBack() {
        navController.popBackStack();
    }
}
