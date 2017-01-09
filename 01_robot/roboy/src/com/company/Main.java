package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Robot robbie = new Robot();
        String continuar;
        do {
            System.out.print("Introduce la coordenada x: ");
            int x = Integer.parseInt(br.readLine());
            System.out.print("Introduce la coordenada y: ");
            int y = Integer.parseInt(br.readLine());

            if (comprobar(robbie, x, y)) {
                robbie.mover(x, y);
                System.out.println("Estoy en x: "+x+", y: "+y);
            } else {
                System.out.println("Coordenadas erróneas");
            }
            System.out.print("¿Quieres continuar? (s/n)");
            continuar = br.readLine();
        }while (continuar.equalsIgnoreCase("s"));

    }

    public static boolean comprobar(Robot r, int x, int y){
        if(x>10 || y >10 || x<-10 || y<-10){
            return false;
        }else {
            if (x == r.getX() && y == r.getY()) {
                return true;
            } else {
                if (x == r.getX() && (y == r.getY() + 1 || y == r.getY() - 1)) {
                    return true;
                } else if (y == r.getY() && (x == r.getX() + 1 || x == r.getX() - 1)) {
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
}
