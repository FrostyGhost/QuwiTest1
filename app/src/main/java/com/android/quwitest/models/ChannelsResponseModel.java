package com.android.quwitest.models;

import java.util.ArrayList;
import java.util.List;

public class ChannelsResponseModel {
    private List<ChannelsModel> channels = new ArrayList<>();

    public List<ChannelsModel> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelsModel> channels) {
        this.channels = channels;
    }
}
