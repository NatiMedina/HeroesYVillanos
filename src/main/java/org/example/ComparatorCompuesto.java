package org.example;

import java.util.ArrayList;
import java.util.List;

public class ComparatorCompuesto implements Comparator {
    private List<Comparator> comparators;

    public ComparatorCompuesto(List<Comparator> comparators) {
        this.comparators = comparators;
    }

    public ComparatorCompuesto() {
        comparators = new ArrayList<>();
    }

    public boolean addComparator(Comparator c) {
        if (c == null) {
            return false;
        }
        return comparators.add(c);
    }

    public boolean addComparator(Comparator c, int index) {
        if (c == null) {
            return false;
        }
        comparators.add(index, c);
        return true;
    }

    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        int comparacion = 0;
        for (Comparator c : comparators) {
            comparacion = c.compare(e1, e2);
            if (comparacion != 0) {
                return comparacion;
            }
        }
        return comparacion;
    }
}
