package com.softulp.tp3pelicula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class SegundaActivity2 extends AppCompatActivity {
    private TextView actorTextView;
    private TextView directorTextView;
    private TextView tituloTextView;
    private TextView descripcionTextView;
    private ImageView fotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);
tituloTextView= findViewById(R.id.idTitulo);
descripcionTextView= findViewById(R.id.idDescripcion);
fotoView=findViewById(R.id.idFoto);
        actorTextView = findViewById(R.id.idActor);
        directorTextView = findViewById(R.id.idDirector);

        Intent intent = getIntent();
        if (intent != null) {
            String titulo = intent.getStringExtra("titulo");
            int imagen = intent.getIntExtra("imagen", -1);
            String descripcion = intent.getStringExtra("descripcion");

            String actor = intent.getStringExtra("actor");
            String director = intent.getStringExtra("director");

            tituloTextView.setText(titulo);
            if (imagen != -1) {
                fotoView.setImageResource(imagen);
            }
            descripcionTextView.setText(descripcion);
            actorTextView.setText(actor);
            directorTextView.setText(director);

        }
        Button btnAtras = findViewById(R.id.btnAtras);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cerrar la actividad actual y volver a la actividad anterior en la pila
            }
        });
    }

}

    /*
private SegundaActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segunda2);

mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);
mv.getPeliculaMutableLiveData().observe(this, new Observer<Pelicula>() {
    @Override
    public void onChanged(Pelicula pelicula) {
        TextView titulo= findViewById(R.id.idTitulo);
        TextView descripcion= findViewById(R.id.idDescripcion);
        TextView director= findViewById(R.id.idDirector);
        TextView actor= findViewById(R.id.idActor);
        ImageView foto= findViewById(R.id.idFoto);

        titulo.setText(pelicula.getTitulo());
        descripcion.setText(pelicula.getDescripcion());
        director.setText(pelicula.getDirector());
        actor.setText(pelicula.getActor());
        foto.setImageResource(pelicula.getFoto());

    }
});
    mv.recuperarPelicula(getIntent());



    }

     */
