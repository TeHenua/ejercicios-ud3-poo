package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Coche c = new Coche();
        System.out.println("Marca: ");
        c.setMarca(br.readLine());
        System.out.println("Modelo: ");
        c.setModelo(br.readLine());
        System.out.println("Color: ");
        c.setColor(Integer.parseInt(br.readLine()));

        System.out.println("¿Cuántos motores tiene?");
        int numMotores = Integer.parseInt(br.readLine());

        for (int i = 0; i < numMotores; i++) {
            Motor m = new Motor();
            System.out.println("Cilindrada: ");
            m.setCilindrada(Integer.parseInt(br.readLine()));
            System.out.println("Combustible: ");
            m.setCombustible(br.readLine());
            System.out.println("Potencia: ");
            m.setPotencia(Integer.parseInt(br.readLine()));
            c.addMotor(m);
        }

        do {
            Rueda r = new Rueda();
            System.out.println("Diámetro:");
            r.setDiametro(br.readLine());
            c.addRueda(r);
        }while (c.getNumRuedas()<4);

        int numPuertas =0;
        do {
            System.out.println("¿Cuántas puertas tiene?");
            numPuertas = Integer.parseInt(br.readLine());
            if(numPuertas<2 || numPuertas>5){
                System.out.println("Error. [2-5]");
            }
        }while (numPuertas>=2 && numPuertas<=5);

        for (int i = 0; i < numPuertas; i++) {
            Puerta p = new Puerta();
            System.out.println("¿Tiene elevalunas eléctrico?(si/no)");
            String respueta = br.readLine();
            if (respueta.equalsIgnoreCase("si")){
                p.setElevalunasElectrico(true);
            }else{
                p.setElevalunasElectrico(false);
            }
            c.addPuerta(p);
        }

        System.out.println(c.toString());

        
    }
}
