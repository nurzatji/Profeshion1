package com.example.profeshion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.profeshion.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.zip.Inflater;

public abstract class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding ;
    private  Button btn;


private ArrayList<String> listIntege = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());







      loadData();



NameAdapter nameAdapter = new NameAdapter(listIntege);
binding.recyclerView.setAdapter(nameAdapter);
    }




    private void loadData() {

        listIntege.add("Логопед");

        listIntege.add("Нарколог");
        listIntege.add("Психиатр");
        listIntege.add("Радиолог");
        listIntege.add("Рентгентолог");
        listIntege.add("Санитар");
        listIntege.add("Стомотолог");
        listIntege.add("Травматолог");
        listIntege.add("Фармацевт");
        listIntege.add("Хирург");
        listIntege.add("Физиотерапевт");
        listIntege.add("Логопед");
        listIntege.add("Медицинская сестра");
        listIntege.add("Косметолог");
        listIntege.add("Кардиохирург");
        listIntege.add("Нейрохирург");
        listIntege.add("Онколог");

    }

    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container,
                                      Bundle savedInstanceState);
}