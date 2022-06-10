package com.android.quwitest.models;

import java.util.ArrayList;

public class ChannelsModel {
    private float id;
    private String type;
    private String dta_create;
    private String id_project = null;
    private float id_partner;
    private String dta_last_read;
    private boolean is_unread_manual;
    private String dta_change_msg;
    MessageLast message_last;
    ArrayList < Object > id_users = new ArrayList < Object > ();
    private boolean is_starred;
    private boolean is_mute;
    private float mute_until_period;
    private boolean is_hide_in_chats_list;
    private String dta_pin = null;
    private boolean pin_to_top;
    private String custom_info = null;
    Draft DraftObject;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDta_create() {
        return dta_create;
    }

    public String getId_project() {
        return id_project;
    }

    public float getId_partner() {
        return id_partner;
    }

    public String getDta_last_read() {
        return dta_last_read;
    }

    public boolean getIs_unread_manual() {
        return is_unread_manual;
    }

    public String getDta_change_msg() {
        return dta_change_msg;
    }

    public MessageLast getMessage_last() {
        return message_last;
    }

    public boolean getIs_starred() {
        return is_starred;
    }

    public boolean getIs_mute() {
        return is_mute;
    }

    public float getMute_until_period() {
        return mute_until_period;
    }

    public boolean getIs_hide_in_chats_list() {
        return is_hide_in_chats_list;
    }

    public String getDta_pin() {
        return dta_pin;
    }

    public boolean getPin_to_top() {
        return pin_to_top;
    }

    public String getCustom_info() {
        return custom_info;
    }

    public Draft getDraft() {
        return DraftObject;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDta_create(String dta_create) {
        this.dta_create = dta_create;
    }

    public void setId_project(String id_project) {
        this.id_project = id_project;
    }

    public void setId_partner(float id_partner) {
        this.id_partner = id_partner;
    }

    public void setDta_last_read(String dta_last_read) {
        this.dta_last_read = dta_last_read;
    }

    public void setIs_unread_manual(boolean is_unread_manual) {
        this.is_unread_manual = is_unread_manual;
    }

    public void setDta_change_msg(String dta_change_msg) {
        this.dta_change_msg = dta_change_msg;
    }

    public void setMessage_last(MessageLast message_last) {
        this.message_last = message_last;
    }

    public void setIs_starred(boolean is_starred) {
        this.is_starred = is_starred;
    }

    public void setIs_mute(boolean is_mute) {
        this.is_mute = is_mute;
    }

    public void setMute_until_period(float mute_until_period) {
        this.mute_until_period = mute_until_period;
    }

    public void setIs_hide_in_chats_list(boolean is_hide_in_chats_list) {
        this.is_hide_in_chats_list = is_hide_in_chats_list;
    }

    public void setDta_pin(String dta_pin) {
        this.dta_pin = dta_pin;
    }

    public void setPin_to_top(boolean pin_to_top) {
        this.pin_to_top = pin_to_top;
    }

    public void setCustom_info(String custom_info) {
        this.custom_info = custom_info;
    }

    public void setDraft(Draft draftObject) {
        this.DraftObject = draftObject;
    }
}