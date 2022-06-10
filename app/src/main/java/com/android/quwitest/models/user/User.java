package com.android.quwitest.models.user;

import java.util.ArrayList;

public class User {
    private float id;
    private String name;
    private String nick;
    private String avatarUrl = null;
    private String dta_create;
    private float timezone_offset;
    private float is_online;
    private boolean is_chat_email_notification;
    private String dta_activity;
    private boolean is_active;
    private float id_company;
    private String role;
    private float due_penalties;
    private float is_timer_online;
    private String dta_timer_activity = null;
    private String timer_last = null;
    private boolean is_shared_from_me;
    ArrayList< Object > projects = new ArrayList < Object > ();
    private String email;
    private boolean is_telegram_connected;
    private String telegram_connect_url;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getDta_create() {
        return dta_create;
    }

    public float getTimezone_offset() {
        return timezone_offset;
    }

    public float getIs_online() {
        return is_online;
    }

    public boolean getIs_chat_email_notification() {
        return is_chat_email_notification;
    }

    public String getDta_activity() {
        return dta_activity;
    }

    public boolean getIs_active() {
        return is_active;
    }

    public float getId_company() {
        return id_company;
    }

    public String getRole() {
        return role;
    }

    public float getDue_penalties() {
        return due_penalties;
    }

    public float getIs_timer_online() {
        return is_timer_online;
    }

    public String getDta_timer_activity() {
        return dta_timer_activity;
    }

    public String getTimer_last() {
        return timer_last;
    }

    public boolean getIs_shared_from_me() {
        return is_shared_from_me;
    }

    public String getEmail() {
        return email;
    }

    public boolean getIs_telegram_connected() {
        return is_telegram_connected;
    }

    public String getTelegram_connect_url() {
        return telegram_connect_url;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setDta_create(String dta_create) {
        this.dta_create = dta_create;
    }

    public void setTimezone_offset(float timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    public void setIs_online(float is_online) {
        this.is_online = is_online;
    }

    public void setIs_chat_email_notification(boolean is_chat_email_notification) {
        this.is_chat_email_notification = is_chat_email_notification;
    }

    public void setDta_activity(String dta_activity) {
        this.dta_activity = dta_activity;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public void setId_company(float id_company) {
        this.id_company = id_company;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDue_penalties(float due_penalties) {
        this.due_penalties = due_penalties;
    }

    public void setIs_timer_online(float is_timer_online) {
        this.is_timer_online = is_timer_online;
    }

    public void setDta_timer_activity(String dta_timer_activity) {
        this.dta_timer_activity = dta_timer_activity;
    }

    public void setTimer_last(String timer_last) {
        this.timer_last = timer_last;
    }

    public void setIs_shared_from_me(boolean is_shared_from_me) {
        this.is_shared_from_me = is_shared_from_me;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIs_telegram_connected(boolean is_telegram_connected) {
        this.is_telegram_connected = is_telegram_connected;
    }

    public void setTelegram_connect_url(String telegram_connect_url) {
        this.telegram_connect_url = telegram_connect_url;
    }
}