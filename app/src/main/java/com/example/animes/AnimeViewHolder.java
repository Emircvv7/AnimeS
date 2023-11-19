package com.example.animes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimeViewHolder extends RecyclerView.ViewHolder {

    private TextView animeName;
    public AnimeViewHolder(@NonNull View itemView) {
        super(itemView);
        animeName = itemView.findViewById(R.id.anime_name);
    }

    public void bind(String name){
        animeName.setText(name);

    }
}
