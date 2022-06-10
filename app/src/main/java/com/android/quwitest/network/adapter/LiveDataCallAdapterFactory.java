package com.android.quwitest.network.adapter;

import androidx.annotation.Nullable;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;

public class LiveDataCallAdapterFactory extends CallAdapter.Factory {

    private static final String TYPE_EXCEPTION = "ReturnType should be parameterized";

    public static LiveDataCallAdapterFactory create() {
        return new LiveDataCallAdapterFactory();
    }

    @Nullable
    @Override
    public CallAdapter<?, ?> get(@Nullable Type returnType, @Nullable Annotation[] annotations, @Nullable Retrofit retrofit) {
        try {
            ParameterizedType enclosingType = (ParameterizedType) returnType;
            return buildCallAdapter(enclosingType);
        } catch (ClassCastException ex) {
            throw new IllegalArgumentException(TYPE_EXCEPTION);
        }
    }

    private LiveDataCallAdapter buildCallAdapter(@Nullable ParameterizedType enclosingType) {
        if (enclosingType == null) {
            return null;
        } else {
            Type type = enclosingType.getActualTypeArguments()[0];
            Type entityType = ((ParameterizedType) type).getActualTypeArguments()[0];
            return new LiveDataCallAdapter(entityType);
        }
    }
}
