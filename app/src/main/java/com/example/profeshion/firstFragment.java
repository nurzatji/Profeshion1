package com.example.profeshion;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.profeshion.databinding.FragmentFirstBinding;


public class firstFragment extends MainActivity {
    private Button btn;
private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater,container,false);
        return  binding.getRoot();
        



    }
}