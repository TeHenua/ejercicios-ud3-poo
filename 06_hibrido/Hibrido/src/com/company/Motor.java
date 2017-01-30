package com.company;

/**
 * Created by TeHenua on 26/01/2017.
 */
public abstract class Motor {
    private int potencia;
    private Coche coche;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

}
