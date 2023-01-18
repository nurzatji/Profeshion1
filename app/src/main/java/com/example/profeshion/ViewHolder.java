package com.example.profeshion;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ViewHolder  extends RecyclerView.ViewHolder {
    private TextView tv_name;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_name  = itemView.findViewById(R.id.tv_name);

    }
    public  void  bind(String name){
        tv_name.setText(name);
    }


}
