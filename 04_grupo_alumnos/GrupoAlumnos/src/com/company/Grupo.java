package com.company;

/**
 * Created by TeHenua on 19/01/2017.
 */
public class Grupo {
    private String codigo;
    Alumno[] alumnos = new Alumno[5];
    int contAlumno=0;
    public Grupo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "codigo='" + codigo + '\'' +
                '}';
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

    public void addAlumno(Alumno a) {
        if (contAlumno<5) {
            alumnos[contAlumno] = a;
            a.setGrupo(this);
            contAlumno++;
        }
    }
}
