package com.softtek.presentacion;

import com.softtek.modelo.Alumnos;

public class usoAlumnos {
    public static void main(String[] args) {
        Alumnos alumno1 = new Alumnos("Gonzalo de la Cruz", 3);

        double[] calificaciones = {7.5, 8, 6.5};
        alumno1.setParciales(calificaciones);
        alumno1.mostrarCalificaciones();
        System.out.println("");
        System.out.println("Promedio de " + alumno1.getNombreCompleto() + ": " + alumno1.calcularPromedio());
    }
}
