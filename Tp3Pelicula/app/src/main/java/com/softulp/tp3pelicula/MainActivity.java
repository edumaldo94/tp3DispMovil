package com.softulp.tp3pelicula;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.softulp.tp3pelicula.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private  MainActivityViewModel vm;

private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        vm = new MainActivityViewModel(getApplication(), this);

        vm.getMutableAdapter().observe(this, new Observer<RecyclerView.Adapter<PeliculaAdapter.ViewHolderPepe>>() {
            @Override
            public void onChanged(RecyclerView.Adapter<PeliculaAdapter.ViewHolderPepe> viewHolderPepeAdapter) {
                GridLayoutManager glm = new GridLayoutManager(MainActivity.this, 1, GridLayoutManager.HORIZONTAL, false);
                binding.recyclerView.setLayoutManager(glm);
                binding.recyclerView.setAdapter(viewHolderPepeAdapter);
            }
        });

    }


}