package com.company;

/**
 * Created by TeHenua on 26/01/2017.
 */
public class Rueda {
    private String diametro;
    private Coche coche;

    public Rueda(){}

    public Rueda(String diametro) {
        this.diametro = diametro;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "diametro='" + diametro + '\'' +
                '}';
    }
}
