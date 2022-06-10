package com.android.quwitest.screen.registration;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.quwitest.models.RegistrationModel;
import com.android.quwitest.network.QuwiApi;
import com.android.quwitest.network.QuwiNetService;

public class RegistrationViewModel extends ViewModel {

    private QuwiApi api = QuwiNetService.getInstance().getApi();

    public MutableLiveData<Boolean> authStatus = new MutableLiveData<>();
    public MutableLiveData<String> errorMsg = new MutableLiveData<>();

    public void signup(RegistrationModel regModel) {
        api.signup(regModel).observeForever(response -> {
            if (response.isSuccess()) {
                if (response.getBody() != null){
                    authStatus.postValue(true);
                }else {
                    errorMsg.postValue("Ooops...");
                }
            }else {
                errorMsg.postValue(response.getErrorMessage());
            }
        });
    }

}
