 package com.android.quwitest.network;

 import androidx.lifecycle.LiveData;

 import com.android.quwitest.models.ChannelsResponseModel;
 import com.android.quwitest.models.LoginModel;
 import com.android.quwitest.models.LoginResponseModel;
 import com.android.quwitest.models.RegistrationModel;
 import com.android.quwitest.network.adapter.Response;

 import retrofit2.http.Body;
 import retrofit2.http.GET;
 import retrofit2.http.Header;
 import retrofit2.http.Headers;
 import retrofit2.http.POST;

 public interface QuwiApi {

     @POST("auth/login")
     LiveData<Response<LoginResponseModel>> login(
             @Body LoginModel loginModel
     );

     @POST("auth/signup")
     LiveData<Response<LoginResponseModel>> signup(
             @Body RegistrationModel loginModel
     );

     @Headers({ "Content-Type: application/json;charset=UTF-8"})
     @GET("chat-channels")
     LiveData<Response<ChannelsResponseModel>> getChannels(
             @Header("Authorization") String token
     );
 }
