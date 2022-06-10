package com.android.quwitest.models;

public class AuthItems {
    private boolean owner;
    private boolean coder;
    private boolean can_edit_time;
    private boolean disc_space;
    private boolean tracked_timer_month;
    private boolean screens_month;
    private boolean chat;
    private boolean instant_screen;
    private boolean timelapse_video;
    private boolean member_area;
    private boolean trial;


    // Getter Methods

    public boolean getOwner() {
        return owner;
    }

    public boolean getCoder() {
        return coder;
    }

    public boolean getCan_edit_time() {
        return can_edit_time;
    }

    public boolean getDisc_space() {
        return disc_space;
    }

    public boolean getTracked_timer_month() {
        return tracked_timer_month;
    }

    public boolean getScreens_month() {
        return screens_month;
    }

    public boolean getChat() {
        return chat;
    }

    public boolean getInstant_screen() {
        return instant_screen;
    }

    public boolean getTimelapse_video() {
        return timelapse_video;
    }

    public boolean getMember_area() {
        return member_area;
    }

    public boolean getTrial() {
        return trial;
    }

    // Setter Methods

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public void setCoder(boolean coder) {
        this.coder = coder;
    }

    public void setCan_edit_time(boolean can_edit_time) {
        this.can_edit_time = can_edit_time;
    }

    public void setDisc_space(boolean disc_space) {
        this.disc_space = disc_space;
    }

    public void setTracked_timer_month(boolean tracked_timer_month) {
        this.tracked_timer_month = tracked_timer_month;
    }

    public void setScreens_month(boolean screens_month) {
        this.screens_month = screens_month;
    }

    public void setChat(boolean chat) {
        this.chat = chat;
    }

    public void setInstant_screen(boolean instant_screen) {
        this.instant_screen = instant_screen;
    }

    public void setTimelapse_video(boolean timelapse_video) {
        this.timelapse_video = timelapse_video;
    }

    public void setMember_area(boolean member_area) {
        this.member_area = member_area;
    }

    public void setTrial(boolean trial) {
        this.trial = trial;
    }
}
