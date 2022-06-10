package com.android.quwitest.models;

public class Draft {
    private String text = null;
    private String id_reply = null;


    // Getter Methods

    public String getText() {
        return text;
    }

    public String getId_reply() {
        return id_reply;
    }

    // Setter Methods

    public void setText(String text) {
        this.text = text;
    }

    public void setId_reply(String id_reply) {
        this.id_reply = id_reply;
    }
}