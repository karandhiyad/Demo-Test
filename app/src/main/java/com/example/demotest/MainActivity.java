package com.example.demotest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.app.Dialog;
import android.os.Bundle;

import com.example.demotest.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SwitchModel> switchModels;
    private ActivityMainBinding binding;

    public static Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.configure_switch_dialog);


        switchModels = new ArrayList<>();
        for (int i = 0;i<6;i++){
            switchModels.add(new SwitchModel("","Switch Number "+i));
        }

        SwitchAddAdapter switchAddAdapter = new SwitchAddAdapter(MainActivity.this,switchModels);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        binding.rvSwitchAdd.setAdapter(switchAddAdapter);
        binding.rvSwitchAdd.setLayoutManager(gridLayoutManager);


    }
}