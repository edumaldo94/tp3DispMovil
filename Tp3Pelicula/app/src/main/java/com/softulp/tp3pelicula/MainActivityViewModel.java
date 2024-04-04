package com.softulp.tp3pelicula;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel  extends AndroidViewModel {
    //private MutableLiveData<List<Pelicula>> peliMutable;
    private ArrayList<Pelicula> listaBC;
    private MutableLiveData<RecyclerView.Adapter<PeliculaAdapter.ViewHolderPepe>> mutableAdapter;
    Context context;

    public MainActivityViewModel(@NonNull Application application, Context c) {
        super(application);
        listaBC=new ArrayList<>();
        context=c;
    }

    public MutableLiveData<RecyclerView.Adapter<PeliculaAdapter.ViewHolderPepe>> getMutableAdapter() {
        if(mutableAdapter==null){
            mutableAdapter=new MutableLiveData<>();
            cargarDatos();
            RecyclerView.Adapter<PeliculaAdapter.ViewHolderPepe>  adapter=new PeliculaAdapter(listaBC,context);
            mutableAdapter.setValue(adapter);
        }
        return mutableAdapter;
    }
    public void cargarDatos(){
        listaBC.add(new Pelicula("Hombre en llamas","Contratado como guardaespaldas de una niña, un agente retirado de la CIA se venga de sus secuestradores en México.","Tony Scott", "densei washintong", R.drawable.hombreenllama));

    }

}
