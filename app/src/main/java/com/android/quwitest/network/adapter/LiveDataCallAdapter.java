package com.android.quwitest.network.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import java.lang.reflect.Type;

import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;

class LiveDataCallAdapter<R> implements CallAdapter<R, LiveData<Response<R>>> {

    private Type responseType;

    LiveDataCallAdapter(Type responseType) {
        this.responseType = responseType;
    }

    @NonNull
    @Override
    public Type responseType() {
        return this.responseType;
    }

    @NonNull
    @Override
    public LiveData<Response<R>> adapt(@NonNull Call<R> call) {
        return new RetrofitLiveData(call);
    }

    private class RetrofitLiveData extends LiveData<Response<R>> implements Callback<R> {

        @NonNull
        private Call<R> call;
        private boolean isSuccess = false;

        private RetrofitLiveData(@NonNull Call<R> call) {
            super();
            this.call = call;
        }

        @Override
        protected void onActive() {
            super.onActive();
            if (!isSuccess) {
                call.enqueue(this);
            }
        }

        @Override
        protected void onInactive() {
            super.onInactive();
            if (call.isExecuted()) {
                call.cancel();
            }
        }

        @Override
        public void onResponse(@NonNull Call<R> call, @Nullable retrofit2.Response<R> response) {
            isSuccess = true;
            postValue(Response.create(response));
        }

        @Override
        public void onFailure(@NonNull Call<R> call, @Nullable Throwable throwable) {
            postValue(Response.create(throwable));
        }
    }
}
