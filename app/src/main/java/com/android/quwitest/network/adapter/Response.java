package com.android.quwitest.network.adapter;

import androidx.annotation.Nullable;

public class Response<T> {

    private static final String UNKNOWN_ERROR = "Unknown error";
    private static final String RESPONSE_IS_NULL = "Response is NULL";

    private T body;
    private int responseCode;
    private String errorMessage;


    private Response(String message) {
        this.errorMessage = message;
    }

    private Response(String errorMessage, int responseCode) {
        this.errorMessage = errorMessage;
        this.responseCode = responseCode;
    }

    private Response(T body, int responseCode) {
        this.body = body;
        this.responseCode = responseCode;
    }

    public static <T> Response<T> create(@Nullable retrofit2.Response<T> serverResponse) {
        if (serverResponse == null) {
            return new Response<>(RESPONSE_IS_NULL);
        } else if (serverResponse.isSuccessful()) {
            return new Response<>(serverResponse.body(), serverResponse.code());
        } else {
            return new Response<>(serverResponse.message(), serverResponse.code());
        }
    }

    public static <T> Response<T> create(@Nullable Throwable error) {
        if (error == null) {
            return new Response<>(UNKNOWN_ERROR);
        }
        return new Response<>(error.getMessage());
    }

    public T getBody() {
        return body;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isSuccess() {
        boolean isOkay = errorMessage == null || errorMessage.isEmpty();
        boolean isCodeSuccess = responseCode >= 200 && responseCode <= 301;
        return isOkay && isCodeSuccess;
    }
}
