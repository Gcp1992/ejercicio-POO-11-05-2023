package com.softtek.modelo;

public class TablaMultiplicar {
    private int numero;

    //Constructor
    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public String mostrarTabla(){
        String tabla="";
        for(int i = 0; i <= 10; i++){
            int resultado=this.numero*i;
            tabla += numero + " x " + i + " = " + resultado + "\n";
        }
        return tabla;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
