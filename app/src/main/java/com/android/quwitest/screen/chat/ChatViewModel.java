package com.android.quwitest.screen.chat;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.quwitest.models.ChannelsResponseModel;
import com.android.quwitest.network.QuwiApi;
import com.android.quwitest.network.QuwiNetService;

public class ChatViewModel extends ViewModel {

    private QuwiApi api = QuwiNetService.getInstance().getApi();

    public MutableLiveData<ChannelsResponseModel> channels = new MutableLiveData<>();
    public MutableLiveData<String> errorMsg = new MutableLiveData<>();

    public void getChannels(String token) {
        Log.d("QQ ", token);
        api.getChannels("Bearer " + token).observeForever(response -> {
            if (response.isSuccess() ) {
                if (response.getBody() != null){
                    channels.postValue(response.getBody());
                }
            }else {
                errorMsg.postValue(response.getErrorMessage());
            }
        });
    }

}
