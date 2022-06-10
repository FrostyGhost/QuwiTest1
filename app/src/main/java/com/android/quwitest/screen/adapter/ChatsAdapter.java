package com.android.quwitest.screen.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.quwitest.R;
import com.android.quwitest.databinding.ItemChatBinding;
import com.android.quwitest.models.ChannelsModel;
import com.bumptech.glide.Glide;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.MessageViewHolder> {

    private List<ChannelsModel> chatsDataList = new ArrayList<>();
    private ChatNavigator listener;

    public ChatsAdapter(ChatNavigator listener) {
        this.listener = listener;
    }

    public void updateMessagesData(List<ChannelsModel> list) {
        chatsDataList.clear();
        chatsDataList.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemChatBinding binding = ItemChatBinding.inflate(inflater, parent, false);
        return new MessageViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        holder.bind(chatsDataList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return chatsDataList.size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {

        private  ItemChatBinding binding;

        MessageViewHolder(@NonNull  ItemChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(ChannelsModel item, ChatNavigator listener) { ;
            binding.getRoot().setOnClickListener(v -> listener.onChatClick());
            setupUserAvatar(getAvatarUrl(item));
            setupTexts(item);
            setupIcons(item);
        }

        void setupTexts(ChannelsModel item){
            binding.tvTime.setText(getTime(item.getDta_create()));
            if (item.getMessage_last()!= null){
                binding.tvLastMsg.setText(item.getMessage_last().getText());
            }
        }

        void setupIcons(ChannelsModel item){
            if (item.getPin_to_top()){
                binding.imgPinIcon.setVisibility(View.VISIBLE);
            }
            if (item.getIs_unread_manual()){
                binding.imgReadIcon.setVisibility(View.VISIBLE);
            }
        }

        void setupUserAvatar(String url){
            Glide.with(binding.imgAvatar).load(url)
                    .placeholder(R.drawable.ic_placeholder_avatar)
                    .into(binding.imgAvatar);
        }

        String getAvatarUrl(ChannelsModel item){
            switch (item.getType()){
                case "pm":{
                    if (item.getMessage_last() != null && item.getMessage_last().getUser() !=null){
                        binding.tvName.setText(item.getMessage_last().getUser().getName());
                        return item.getMessage_last().getUser().getAvatar_url();
                    }
                }break;
                case "main":{
                    //todo add logic here
                }break;
                case "project":{
                    //todo add logic here
                }break;
            }
            return "";
        }

        @SuppressLint("SimpleDateFormat")
        public static String getTime(String nextClassDate){
            SimpleDateFormat fullDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
            Date date = null;;

            if (nextClassDate != null && !nextClassDate.isEmpty()){
                try {
                    date = fullDateFormat.parse(nextClassDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }}
            if (date != null){
                return new SimpleDateFormat("EEE HH:mm").format(date);
            }
            return "";
        }
    }

}
