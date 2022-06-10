package com.android.quwitest.models.user;

public class UserSettings {
    private String lang;
    private float mute_until_period;
    private boolean is_mute_chats;
    private String dta_mute_until = null;
    private String client_settings = null;
    private boolean cache_updated;


    // Getter Methods

    public String getLang() {
        return lang;
    }

    public float getMute_until_period() {
        return mute_until_period;
    }

    public boolean getIs_mute_chats() {
        return is_mute_chats;
    }

    public String getDta_mute_until() {
        return dta_mute_until;
    }

    public String getClient_settings() {
        return client_settings;
    }

    public boolean getCache_updated() {
        return cache_updated;
    }

    // Setter Methods

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setMute_until_period(float mute_until_period) {
        this.mute_until_period = mute_until_period;
    }

    public void setIs_mute_chats(boolean is_mute_chats) {
        this.is_mute_chats = is_mute_chats;
    }

    public void setDta_mute_until(String dta_mute_until) {
        this.dta_mute_until = dta_mute_until;
    }

    public void setClient_settings(String client_settings) {
        this.client_settings = client_settings;
    }

    public void setCache_updated(boolean cache_updated) {
        this.cache_updated = cache_updated;
    }
}