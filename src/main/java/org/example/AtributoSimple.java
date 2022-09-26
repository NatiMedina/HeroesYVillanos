package org.example;

public class AtributoSimple implements Atributo{

    private float value;

    public AtributoSimple(float value){
        this.value = value;
    }

    @Override
    public float getValor(Enfrentable e) {
        return value;
    }

    public void setValor(float value) {
        this.value = value;
    }
}
