package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Juego {

    private List<Enfrentable> enfrentables;

    public Juego() {
        enfrentables = new ArrayList<>();
    }

    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator c) {
      /*  ArrayList<Enfrentable> quienesVencen = new ArrayList<>();
        for (Enfrentable enfrentable: enfrentables) {
            if(enfrentar(enfrentable, e, c) == enfrentable){
                quienesVencen.add(enfrentable);
            }
        }
        return quienesVencen;*/

        return enfrentables.stream()
                .filter(enfrentable -> enfrentar(e, enfrentable, c) != e)
                .collect(Collectors.toList());
    }

    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator c) {
        if (c.compare(e1, e2) >= 0) {
            return e1;
        }
        return e2;
    }

    public boolean addEnfrentable(Enfrentable e) {
        if (e == null) {
            return false;
        }
        return enfrentables.add(e);
    }

    public List<Personaje> ordenarPersonajes(Comparator c) {
        List<Personaje> aux = new ArrayList<>();

        for (Enfrentable e : enfrentables) {
            aux.addAll(e.getPersonajes());
        }

        return aux.stream().sorted(c).distinct().collect(Collectors.toList());
    }
}
