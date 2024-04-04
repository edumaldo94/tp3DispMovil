package com.softulp.tp3pelicula;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolderPepe> {

    private List<Pelicula> listapeli;
    private Context context;


    public PeliculaAdapter(List<Pelicula> listapeli, Context context) {
        this.listapeli = listapeli;
        this.context = context;

    }
public void setPeliculas(List<Pelicula> peliculas){
        listapeli.clear();
        listapeli.addAll(peliculas);
        notifyDataSetChanged();

}
    @NonNull
    @Override
    public ViewHolderPepe onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        return new ViewHolderPepe(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPepe holder, int position) {
Pelicula pelicula= listapeli.get(position);

holder.titulo.setText(pelicula.getTitulo());
holder.descripcion.setText(pelicula.getDescripcion());
holder.foto.setImageResource(pelicula.getFoto());

holder.button.setOnClickListener(new View.OnClickListener() {
    /*
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(context, SegundaActivity2.class);
        intent.putExtra("pelicula", pelicula);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, SegundaActivity2.class);
        // Aquí pasas los datos de la película a la segunda Activity
        intent.putExtra("titulo", pelicula.getTitulo());
        intent.putExtra("descripcion", pelicula.getDescripcion());
        intent.putExtra("director", pelicula.getDirector());
        intent.putExtra("actor", pelicula.getActor());
        intent.putExtra("imagen", pelicula.getFoto());
        context.startActivity(intent);
    }
});

    }

    @Override
    public int getItemCount() {
        return listapeli.size();
    }

    public class  ViewHolderPepe extends  RecyclerView.ViewHolder{
TextView titulo, descripcion, director, actor;
ImageView foto;
Button button;
        public ViewHolderPepe(@NonNull View itemView) {
            super(itemView);
            titulo= itemView.findViewById(R.id.idTitulo);
            descripcion=itemView.findViewById(R.id.idDescripcion);
            director= itemView.findViewById(R.id.idDirector);
            actor=itemView.findViewById(R.id.idActor);
            foto=itemView.findViewById(R.id.idFoto);
            button=itemView.findViewById(R.id.btndetalle);
        }
    }
}
