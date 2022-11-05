package com.example.authapp;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.authapp.R;

import java.util.List;

public class adaptery<context, movie> extends RecyclerView.Adapter<adaptery.MyViewHolder>{

    private context mContext;
    private List<movie> movieList;


    public adaptery(context mContext, List<movie> movieList) {
        this.mContext = mContext;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public adaptery.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater layoutInflater = LayoutInflater.from((Context) mContext);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull adaptery.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class myViewHolder extends RecyclerView.ViewHolder{


        TextView title;
        TextView id;
        ImageView img;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView2);
            id = itemView.findViewById(R.id.textView3);
            img = itemView.findViewById(R.id.imageView);
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
