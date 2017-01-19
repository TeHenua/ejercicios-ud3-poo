package com.company;

/**
 * Created by TeHenua on 19/01/2017.
 */
public class Grupo {
    private String codigo;
    Alumno[] alumnos = new Alumno[5];

    public Grupo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
}
