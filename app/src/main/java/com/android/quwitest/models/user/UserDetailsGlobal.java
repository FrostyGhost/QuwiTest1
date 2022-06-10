package com.android.quwitest.models.user;

public class UserDetailsGlobal {
    private String client_settings = null;
    private boolean is_chat_email_notification;


    // Getter Methods

    public String getClient_settings() {
        return client_settings;
    }

    public boolean getIs_chat_email_notification() {
        return is_chat_email_notification;
    }

    // Setter Methods

    public void setClient_settings(String client_settings) {
        this.client_settings = client_settings;
    }

    public void setIs_chat_email_notification(boolean is_chat_email_notification) {
        this.is_chat_email_notification = is_chat_email_notification;
    }
}