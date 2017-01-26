package com.company;

/**
 * Created by TeHenua on 26/01/2017.
 */
public class Puerta {
    private boolean elevalunasElectrico;
    private Coche coche;

    public Puerta(){}

    public Puerta(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public boolean isElevalunasElectrico() {
        return elevalunasElectrico;
    }

    public void setElevalunasElectrico(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "elevalunasElectrico=" + elevalunasElectrico +
                '}';
    }
}
