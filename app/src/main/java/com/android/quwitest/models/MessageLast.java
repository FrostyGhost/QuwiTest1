package com.android.quwitest.models;

public class MessageLast {
    private float id;
    private float id_user;
    MessageUser user;
    private float id_channel;
    private String dta_create;
    private float is_read;
    private boolean is_starred;
    private boolean is_edited;
    private String text;
    private String snippet;
    private String reply_on = null;
    private String file = null;


    // Getter Methods

    public float getId() {
        return id;
    }

    public float getId_user() {
        return id_user;
    }

    public MessageUser getUser() {
        return user;
    }

    public float getId_channel() {
        return id_channel;
    }

    public String getDta_create() {
        return dta_create;
    }

    public float getIs_read() {
        return is_read;
    }

    public boolean getIs_starred() {
        return is_starred;
    }

    public boolean getIs_edited() {
        return is_edited;
    }

    public String getText() {
        return text;
    }

    public String getSnippet() {
        return snippet;
    }

    public String getReply_on() {
        return reply_on;
    }

    public String getFile() {
        return file;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setId_user(float id_user) {
        this.id_user = id_user;
    }

    public void setUser(MessageUser userObject) {
        this.user = userObject;
    }

    public void setId_channel(float id_channel) {
        this.id_channel = id_channel;
    }

    public void setDta_create(String dta_create) {
        this.dta_create = dta_create;
    }

    public void setIs_read(float is_read) {
        this.is_read = is_read;
    }

    public void setIs_starred(boolean is_starred) {
        this.is_starred = is_starred;
    }

    public void setIs_edited(boolean is_edited) {
        this.is_edited = is_edited;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public void setReply_on(String reply_on) {
        this.reply_on = reply_on;
    }

    public void setFile(String file) {
        this.file = file;
    }
}