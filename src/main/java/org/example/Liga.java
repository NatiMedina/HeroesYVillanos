package org.example;

import java.util.ArrayList;
import java.util.List;

public class Liga extends Enfrentable{

    private List<Enfrentable> integrantes;

    public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes){
        super(nombre, nombreFantasia);
        integrantes = new ArrayList<>();
    }

    public Liga(String nombre, String nombreFantasia){
        super(nombre, nombreFantasia);
    }

    public boolean addIntegrante(Enfrentable e){
        return false;
    }

    @Override
    public float getValorAtributo(String key) {
        return 0;
    }

    @Override
    protected List<Personaje> getPersonajes() {
        return null;
    }
}
