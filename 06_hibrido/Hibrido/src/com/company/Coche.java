package com.company;

/**
 * Created by TeHenua on 26/01/2017.
 */
public class Coche {
    private String marca;
    private String modelo;
    private int color;
    private Motor[] motores;
    private Rueda[] ruedas;
    private Puerta[] puertas;
    private int numMotores=0;
    private int numRuedas=0;
    private int numPuertas=0;

    public int getNumRuedas(){
        return numRuedas;
    }

    public int getNumMotores(){
        return numMotores;
    }

    public int getNumPuertas(){
        return numPuertas;
    }

    public void addMotor(Motor motor){
        if(numMotores<5){
            motores[numMotores] = motor;
            motor.setCoche(this);
            numMotores++;
        }
    }

    public void addRueda(Rueda rueda){
        if(numRuedas<4){
            ruedas[numRuedas] = rueda;
            rueda.setCoche(this);
            numRuedas++;
        }
    }

    public void addPuerta(Puerta puerta){
        if(numPuertas<5){
            puertas[numPuertas] = puerta;
            puerta.setCoche(this);
            numPuertas++;
        }
    }

    public Coche() {
        motores = new Motor[10];
        ruedas = new Rueda[4];
        puertas = new Puerta[5];
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Motor[] getMotores() {
        return motores;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                '}';
    }
}
