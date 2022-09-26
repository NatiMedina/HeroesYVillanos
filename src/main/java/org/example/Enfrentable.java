package org.example;

import java.util.List;

public abstract class Enfrentable {

    protected String nombre;
    protected String nombreFantasia;

    public Enfrentable(String nombre, String nombreFantasia){

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getNombreFantasia(){
        return this.nombreFantasia;
    }

    public abstract float getValorAtributo(String key);

    public Enfrentable enfrentar(Enfrentable e, Comparator c){
        return e;
    }

    public List<Personaje> ordenar(Comparator c){
        return null;
    }

    protected abstract List<Personaje> getPersonajes();
}
