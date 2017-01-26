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

        boolean cont= false;
        int n=0;
        do {
            Puerta p = new Puerta();
            System.out.println("¿Tiene elevalunas eléctrico?(s/n)");
            p.setElevalunasElectrico( br.readLine().equalsIgnoreCase("s"));
            c.addPuerta(p);
            System.out.println("¿Quieres continuar? (s/n)");
            cont = br.readLine().equalsIgnoreCase("s");
            n++;
        }while ((cont && n<5) || (n<2) );


        System.out.println(c);

        
    }
}
