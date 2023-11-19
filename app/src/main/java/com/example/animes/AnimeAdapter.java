package com.example.animes;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<com.example.animes.AnimeViewHolder> {

    private ArrayList<String> animeList;

    public AnimeAdapter(ArrayList<String> animeList) {
        this.animeList = animeList;
    }

    @NonNull
    @Override
    public com.example.animes.AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new com.example.animes.AnimeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.animes.AnimeViewHolder holder, int position) {
        holder.bind(animeList.get(position));
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }
}
