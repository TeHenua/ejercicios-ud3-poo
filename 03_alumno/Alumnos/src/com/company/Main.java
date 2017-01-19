package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Alumno[] alumnos = new Alumno[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre: ");
            String nombre = br.readLine();
            System.out.print("Introduce el apellido: ");
            String apellido = br.readLine();
            System.out.print("Introduce el dni: ");
            String dni = br.readLine();
            System.out.print("Introduce el telefono: ");
            String telefono = br.readLine();
            alumnos[i] = new Alumno(nombre,apellido,dni,telefono);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre: "+alumnos[i].getNombre()+" Apellido: "+alumnos[i].getApellidos()+" DNI: "
                    +alumnos[i].getDni()+" Teléfono: "+alumnos[i].getTelefono());
        }
    }
}
