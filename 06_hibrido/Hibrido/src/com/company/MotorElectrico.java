package com.company;

/**
 * Created by TeHenua on 30/01/2017.
 */
public class MotorElectrico extends Motor {

    private String tipoBateria;

    public MotorElectrico(int potencia, String tipoBateria) {
        super(potencia);
        this.tipoBateria = tipoBateria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }
}
