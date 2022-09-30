package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Liga extends Enfrentable {

    private List<Enfrentable> integrantes;

    public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes) {
        super(nombre, nombreFantasia);
        integrantes = new ArrayList<>();
    }

    public Liga(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    public boolean addIntegrante(Enfrentable e) {
        if (e == null) {
            return false;
        }
        return integrantes.add(e);
    }

    @Override
    public float getValorAtributo(String key) {
        if (integrantes.isEmpty()) {
            return 0f;
        }

        double suma = integrantes.stream().mapToDouble(e -> e.getValorAtributo(key)).sum();

        return (float) suma / integrantes.size();
    }

    @Override
    protected List<Personaje> getPersonajes() {
        return integrantes.stream().map(Enfrentable::getPersonajes).flatMap(List::stream).distinct().collect(Collectors.toList());
    }
}
