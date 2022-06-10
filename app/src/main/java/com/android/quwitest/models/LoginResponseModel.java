package com.android.quwitest.models;

public class LoginResponseModel {
    private String token;
    AppInit App_initObject;
    private String already_join_project = null;


    // Getter Methods

    public String getToken() {
        return token;
    }

    public AppInit getApp_init() {
        return App_initObject;
    }

    public String getAlready_join_project() {
        return already_join_project;
    }

    // Setter Methods

    public void setToken(String token) {
        this.token = token;
    }

    public void setApp_init(AppInit app_initObject) {
        this.App_initObject = app_initObject;
    }

    public void setAlready_join_project(String already_join_project) {
        this.already_join_project = already_join_project;
    }
}


