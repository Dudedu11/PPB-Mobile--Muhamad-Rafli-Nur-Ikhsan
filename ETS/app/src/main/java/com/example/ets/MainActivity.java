package com.example.ets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(dataClub.getListData());
    }

    private void showRecycleList(){
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListClub listClub = new ListClub(list);
        rvClub.setAdapter(listClub);
    }
}