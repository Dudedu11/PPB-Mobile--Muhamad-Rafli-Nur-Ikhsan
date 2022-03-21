package com.example.ets;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListClub extends RecyclerView.Adapter<ListClub.ListViewHolder> {
    private ArrayList<Club> listClub;

    public ListClub(ArrayList<Club> list){
        this.listClub = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_club, parent,false);
        return new  ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Club club = listClub.get(position);
        holder.namaklub.setText(club.getNama());
        holder.pointklub.setText(club.getPoint());
    }

    @Override
    public int getItemCount() {
        return listClub.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView namaklub, pointklub;

        ListViewHolder(View itemview) {
            super(itemview);
            namaklub = itemview.findViewById(R.id.namaklub);
            pointklub = itemview.findViewById(R.id.pointklub);
        }
    }
}
