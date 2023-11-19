package com.example.animes;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvAnime;
    private ArrayList<String> animeList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        AnimeAdapter adapter = new AnimeAdapter(animeList);
        if (rvAnime != null) {
            rvAnime.setAdapter(adapter);
        }
    }

    private void loadData() {
        animeList.add("Хантер х Хантер");
        animeList.add("Черный Клевер");
        animeList.add("Атака Титанов");
        animeList.add("Синяя Тюрма");
        animeList.add("Первый Шаг");
        animeList.add("Магическая Битва");
        animeList.add("Пять Невест");
        animeList.add("Ван Пис");
        animeList.add("Тетрадь Смерти");
        animeList.add("Наруто");
        animeList.add("Блич");
        animeList.add("Бродячие Псы");
        animeList.add("Джо Джо");
    }

    private void initView(View view) {
        rvAnime = view.findViewById(R.id.rv_animes);
    }
}
