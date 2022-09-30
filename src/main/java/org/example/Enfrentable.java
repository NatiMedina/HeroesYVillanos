package org.example;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Enfrentable {

    protected String nombre;
    protected String nombreFantasia;

    public Enfrentable(String nombre, String nombreFantasia) {
        this.nombre = nombre;
        this.nombreFantasia = nombreFantasia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNombreFantasia() {
        return this.nombreFantasia;
    }

    public abstract float getValorAtributo(String key);

    public Enfrentable enfrentar(Enfrentable e, Comparator c) {
        if (c.compare(this, e) >= 0) {
            return this;
        }
        return e;
    }

    public List<Personaje> ordenar(Comparator c) {
        return getPersonajes().stream().
                sorted(c).collect(Collectors.toList());
    }

    protected abstract List<Personaje> getPersonajes();
}
