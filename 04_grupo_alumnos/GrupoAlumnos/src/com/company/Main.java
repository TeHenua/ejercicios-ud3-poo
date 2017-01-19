package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el nombre del grupo");
        Grupo g = new Grupo(br.readLine());
        Alumno[] a = g.getAlumnos();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre: ");
            String nombre = br.readLine();
            System.out.print("Introduce el apellido: ");
            String apellido = br.readLine();
            System.out.print("Introduce el dni: ");
            String dni = br.readLine();
            System.out.print("Introduce el telefono: ");
            String telefono = br.readLine();

            a[i] = new Alumno(nombre,apellido,dni,telefono);

        }
        g.setAlumnos(a);
        System.out.println("Grupo: "+g.getCodigo());
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre: "+g.getAlumnos()[i].getNombre()+" Apellido: "+g.getAlumnos()[i].getApellidos()+" DNI: "
                    +g.getAlumnos()[i].getDni()+" Teléfono: "+g.getAlumnos()[i].getTelefono());
        }
    }
}
