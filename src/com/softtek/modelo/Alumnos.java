package com.softtek.modelo;

public class Alumnos {
    private String nombreCompleto;
    //Un campo que sea una matriz para almacenar las calificaciones de los parciales.
    private double[] parciales;

    //Constructor que inicializa las variables de nombreCompleto y dimensionar el array de parciales
    public Alumnos(String nombreCompleto, int numParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[numParciales];
    }

    //Método setter para  asignar los valores de los parciales
    public void setParciales(double[] parciales) {
        this.parciales = parciales;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : parciales) {
            suma += nota;
        }
        return suma / parciales.length;
    }

    public void mostrarCalificaciones() {
        System.out.print("Calificaciones de " + this.nombreCompleto + ": ");
        for (int i = 0; i < parciales.length; i++) {
            System.out.print(parciales[i] + " ");
        }

    }
}
