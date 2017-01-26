package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el nombre del grupo");
        Grupo g = new Grupo(br.readLine());

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre: ");
            String nombre = br.readLine();
            System.out.print("Introduce el apellido: ");
            String apellido = br.readLine();
            System.out.print("Introduce el dni: ");
            String dni = br.readLine();
            System.out.print("Introduce el telefono: ");
            String telefono = br.readLine();

            g.addAlumno(new Alumno(nombre,apellido,dni,telefono));

        }
        System.out.println(g.toString());
        for (int i = 0; i < 5; i++) {
            //System.out.println(g.getAlumnos().toString());
        }
    }
}
