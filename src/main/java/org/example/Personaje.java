package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Personaje extends Enfrentable {

    private Map<String, Atributo> atributos;

    public Personaje(String nombre, String nombreFantasia){
        super(nombre, nombreFantasia);
        atributos = new HashMap<>();

    }

    @Override
    public float getValorAtributo(String key){
        Atributo atributo = atributos.get(key);
        if (atributo == null) {
            return 0;
        }
        return atributo.getValor(this);
    }

    @Override
    protected List<Personaje> getPersonajes() {
        return List.of(this);
    }

    public boolean addAtributo(String k, Atributo a){
       atributos.put(k,a);
       return true;
    }
}
