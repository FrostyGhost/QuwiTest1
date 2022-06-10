package com.android.quwitest.models;

import com.android.quwitest.models.user.User;
import com.android.quwitest.models.user.UserDetailsGlobal;
import com.android.quwitest.models.user.UserSettings;

import java.util.ArrayList;

public class AppInit {
    User UserObject;
    UserDetailsGlobal User_settings_globalObject;
    UserSettings User_settingsObject;
    ArrayList< Object > companies = new ArrayList < Object > ();
    AuthItems Auth_itemsObject;
    private float chats_count_unread;
    ArrayList < Object > hidden_projects = new ArrayList < Object > ();


    // Getter Methods

    public User getUser() {
        return UserObject;
    }

    public UserDetailsGlobal getUser_settings_global() {
        return User_settings_globalObject;
    }

    public UserSettings getUser_settings() {
        return User_settingsObject;
    }

    public AuthItems getAuth_items() {
        return Auth_itemsObject;
    }

    public float getChats_count_unread() {
        return chats_count_unread;
    }

    // Setter Methods

    public void setUser(User userObject) {
        this.UserObject = userObject;
    }

    public void setUser_settings_global(UserDetailsGlobal user_settings_globalObject) {
        this.User_settings_globalObject = user_settings_globalObject;
    }

    public void setUser_settings(UserSettings user_settingsObject) {
        this.User_settingsObject = user_settingsObject;
    }

    public void setAuth_items(AuthItems auth_itemsObject) {
        this.Auth_itemsObject = auth_itemsObject;
    }

    public void setChats_count_unread(float chats_count_unread) {
        this.chats_count_unread = chats_count_unread;
    }
}