package com.softtek.modelo;

public class Campos {
    //Variables del método
    private int x;

    // Constructor que inicializa el campo x
    public Campos(int x) {
        this.x = x;
    }

    //Métodos de la clase
    // Método que muestra el valor actual de x
    public int muestra() {
        return x;
    }

    // Método que incrementa el valor de x
    public void incrementa() {
        x++;
    }
}
