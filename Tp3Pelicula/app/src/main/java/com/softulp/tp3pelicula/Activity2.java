/*package com.softulp.tp3pelicula;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.softulp.tp3pelicula.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {

    private Activity2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent=getIntent();
        binding.textView.setText(intent.getStringExtra("titulo"));
    }
}*/