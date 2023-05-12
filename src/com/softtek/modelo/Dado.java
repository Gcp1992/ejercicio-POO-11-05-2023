package com.softtek.modelo;

public class Dado {
    private int numero;

    public Dado() {
        this.numero = (int) (Math.random() * 6) + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void dibujarUno() {
        System.out.println(" _____ ");
        System.out.println("|     |");
        System.out.println("|  o  |");
        System.out.println("|_____|");
    }

    public void dibujarDos() {
        System.out.println(" _____ ");
        System.out.println("|     |");
        System.out.println("|o   o|");
        System.out.println("|_____|");
    }

    public void dibujarTres() {
        System.out.println(" _____ ");
        System.out.println("| o   |");
        System.out.println("|  o  |");
        System.out.println("|___o_|");
    }

    public void dibujarCuatro() {
        System.out.println(" _____ ");
        System.out.println("|o   o|");
        System.out.println("|     |");
        System.out.println("|o___o|");
    }

    public void dibujarCinco() {
        System.out.println(" _____ ");
        System.out.println("|o   o|");
        System.out.println("|  o  |");
        System.out.println("|o___o|");
    }

    public void dibujarSeis() {
        System.out.println(" _____ ");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("|o___o|");
    }

    public void lanzar() {
        this.numero = (int) (Math.random() * 6) + 1;
        switch (this.numero) {
            case 1:
                dibujarUno();
                break;
            case 2:
                dibujarDos();
                break;
            case 3:
                dibujarTres();
                break;
            case 4:
                dibujarCuatro();
                break;
            case 5:
                dibujarCinco();
                break;
            case 6:
                dibujarSeis();
                break;
            default:
                System.out.println("Número fuera de rango");
        }
    }
}
