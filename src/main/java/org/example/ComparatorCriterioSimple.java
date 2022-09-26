package org.example;

public class ComparatorCriterioSimple implements Comparator{
    private String atributo;

    public ComparatorCriterioSimple(String atributo) {
        this.atributo = atributo;
    }

    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        return (int) (e1.getValorAtributo(atributo) - e2.getValorAtributo(atributo));
    }
}
