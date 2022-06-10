package com.android.quwitest.screen.login;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.quwitest.models.LoginModel;
import com.android.quwitest.models.LoginResponseModel;
import com.android.quwitest.network.QuwiApi;
import com.android.quwitest.network.QuwiNetService;

public class LoginViewModel extends ViewModel {

    private QuwiApi api = QuwiNetService.getInstance().getApi();

    public MutableLiveData<LoginResponseModel> authStatus = new MutableLiveData<>();
    public MutableLiveData<String> errorMsg = new MutableLiveData<>();

    public void login(LoginModel loginModel) {
        api.login(loginModel).observeForever(response -> {
            if (response.isSuccess()) {
                if (response.getBody() != null){
                    authStatus.postValue(response.getBody());
                }else {
                    errorMsg.postValue("Ooops...");
                }
            }else {
                errorMsg.postValue(response.getErrorMessage());
            }
        });
    }

}
