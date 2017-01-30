package com.company;

/**
 * Created by TeHenua on 30/01/2017.
 */
public class MotorCombustionInterna extends Motor {

    private int cilindrada;
    private String combustible;

    public MotorCombustionInterna(int potencia, int cilindrada, String combustible) {
        super(potencia);
        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
