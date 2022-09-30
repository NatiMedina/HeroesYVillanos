package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Juego {

    private List<Enfrentable> enfrentables;

    public Juego() {
        enfrentables = new ArrayList<>();
    }

    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator c) {
        return enfrentables.stream()
                .filter(enfrentable -> enfrentar(e, enfrentable, c) != e)
                .collect(Collectors.toList());
    }

    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator c) {
        return e1.enfrentar(e2, c);
    }

    public boolean addEnfrentable(Enfrentable e) {
        if (e == null) {
            return false;
        }
        return enfrentables.add(e);
    }

    public List<Personaje> ordenarPersonajes(Comparator c) {
        return enfrentables.stream()
                .map(Enfrentable::getPersonajes)
                .flatMap(List::stream)
                .distinct()
                .sorted(c)
                .collect(Collectors.toList());
    }
}
