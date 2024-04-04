package com.softulp.tp3pelicula;

import android.content.Intent;
import android.os.Bundle;
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

    private TextView tituloTextView;
    private ImageView fotoImageView;
    private TextView descripcionTextView;
    private TextView actorTextView;
    private TextView directorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        tituloTextView = findViewById(R.id.idTitulo);
        fotoImageView = findViewById(R.id.idFoto);
        descripcionTextView = findViewById(R.id.idDescripcion);
        actorTextView = findViewById(R.id.idActor);
        directorTextView = findViewById(R.id.idDirector);

        // Recuperar los datos pasados desde la MainActivity
        Intent intent = getIntent();
        if (intent != null) {
            String titulo = intent.getStringExtra("titulo");
            int imagenResId = intent.getIntExtra("imagen", -1);
            String descripcion = intent.getStringExtra("descripcion");
            String actor = intent.getStringExtra("actor");
            String director = intent.getStringExtra("director");

            // Configurar las vistas con los datos recibidos
            tituloTextView.setText(titulo);
            if (imagenResId != -1) {
                fotoImageView.setImageResource(imagenResId);
            }
            descripcionTextView.setText(descripcion);
            actorTextView.setText(actor);
            directorTextView.setText(director);
        }
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
