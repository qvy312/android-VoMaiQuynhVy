package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.happybirthday.databinding.ActivityMainBinding;
import com.example.happybirthday.databinding.ActivityWishingScreenBinding;

public class WishingScreen extends AppCompatActivity {

    //View Binding
    ActivityWishingScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWishingScreenBinding.inflate(getLayoutInflater());
        setContentView(binding .getRoot());

        //To make the input
        Intent intent = getIntent();
        String name = intent.getExtras().getString("Name");

        binding.name.setText(name);


    }
}