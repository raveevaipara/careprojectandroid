package com.ssaurel.count;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {

    Context context;
    List<Item> postList;

    public PostAdapter(Context context, List<Item> postList){
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(context).inflate(R.layout.rachpost, parent, false);
        return new PostHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, int position) {

        Item item = postList.get(position);
        holder.setImageView(item.getImageUrl());
        holder.setmTags(item.getTags());
        holder.setmLikes(item.getLikes());


//        holder.setmheart(item.getBtn());

    }

    public CallbackPost callbackPost;

    interface CallbackPost {
        public void saveFav(Item item);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView mLikes, mTags;
        View view;
        //        View favbtn;
        ImageView fav;

        public PostHolder(@NonNull View itemView){
            super(itemView);
            view = itemView;
        }

        public void setImageView(String url){
            imageView = view.findViewById(R.id.imageview);
            Glide.with(context).load(url).into(imageView);
        }
        public void setmLikes(int likes){
            mLikes = view.findViewById(R.id.likes);
            mLikes.setText("Calorie: "+ likes + " CAL");
        }
        public void  setmTags(String tags){
            mTags = view.findViewById(R.id.tags);
            mTags.setText("Food: " +tags);
        }
        //        public void  setmheart(Button favBtn){
//            favbtn = view.findViewById(R.id.favBtn);
//        }



    }
}
