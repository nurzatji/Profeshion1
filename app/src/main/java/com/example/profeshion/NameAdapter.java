package com.example.profeshion;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class NameAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<String> listIntege;

    public NameAdapter(ArrayList<String> listIntege ) {
        this.listIntege = listIntege;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profeshion,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(listIntege.get(position));

    }

    @Override
    public int getItemCount() {
        return listIntege.size();
    }


}
