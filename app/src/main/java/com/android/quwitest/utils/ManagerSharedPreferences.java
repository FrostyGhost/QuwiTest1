package com.android.quwitest.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ManagerSharedPreferences {
    private static final String NAME_SHARED_PREFERENCES = "blablabla";
    private static final String PREFS_ACCESS_TOKEN = "accessToken";

    private static ManagerSharedPreferences instance;
    private final SharedPreferences sharedPreferences;

    private ManagerSharedPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences(NAME_SHARED_PREFERENCES, Context.MODE_PRIVATE);
    }

    public static ManagerSharedPreferences getInstance(Context context) {
        if (instance == null) {
            instance = new ManagerSharedPreferences(context);
        }
        return instance;
    }

    public String getAccessToken() {
        if (sharedPreferences != null){
            return sharedPreferences.getString(PREFS_ACCESS_TOKEN, "");
        }else {
            return "";
        }
    }

    public void setAccessToken(String accessToken) {
        sharedPreferences.edit().putString(PREFS_ACCESS_TOKEN, accessToken).apply();
    }

    public void clearAccessToken() {
        sharedPreferences.edit().remove(PREFS_ACCESS_TOKEN).apply();
    }
}
