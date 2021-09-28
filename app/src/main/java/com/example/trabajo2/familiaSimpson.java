package com.example.trabajo2;

public class familiaSimpson {
    private String nombre;
    private String descripcion;
    private String actorVoz;
    private int foto;

    public familiaSimpson(String nombre, String descripcion, String actorVoz, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.actorVoz = actorVoz;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActorVoz() {
        return actorVoz;
    }

    public void setActorVoz(String actorVoz) {
        this.actorVoz = actorVoz;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
