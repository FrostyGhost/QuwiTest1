package com.android.quwitest.network;

import com.android.quwitest.utils.Const;
import com.android.quwitest.network.adapter.LiveDataCallAdapterFactory;

import java.util.concurrent.TimeUnit;

import jp.wasabeef.glide.transformations.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class QuwiNetService {

    private static QuwiNetService serviceInstance;
    private Retrofit retrofit;
    private static final int TIMEOUT_SECONDS = 60;

    public static QuwiNetService getInstance() {
        synchronized (new Object()) {
            if (serviceInstance == null) {
                serviceInstance = new QuwiNetService();
            }
            return serviceInstance;
        }
    }

    private QuwiNetService() {
        OkHttpClient httpClient = buildHttpClient();
        this.retrofit = buildRetrofit(httpClient);
    }

    private OkHttpClient buildHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS);
        builder.connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS);

        if (BuildConfig.DEBUG) {
            builder.addInterceptor(createLoggingInterceptor());
        }
        return builder.build();
    }

    private HttpLoggingInterceptor createLoggingInterceptor() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        return logging.setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    private Retrofit buildRetrofit(OkHttpClient httpClient) {
        return new Retrofit.Builder()
                    .baseUrl(Const.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdapterFactory.create())
                .client(httpClient)
                .build();
    }

    public QuwiApi getApi() {
        return retrofit.create(QuwiApi.class);
    }
}
