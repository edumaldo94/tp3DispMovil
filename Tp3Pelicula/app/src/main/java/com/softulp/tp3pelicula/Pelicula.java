package com.softulp.tp3pelicula;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo,descripcion,director,actor;
    private int foto;

    public Pelicula(String titulo, String descripcion, String director, String actor, int foto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.director = director;
        this.actor = actor;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
