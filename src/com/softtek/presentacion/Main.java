package com.softtek.presentacion;

import com.softtek.modelo.Campos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Creamos una instancia de la clase Campos con valor inicial 0

        Campos campos = new Campos(0);

        // Incrementamos el valor de x
        campos.incrementa();

        // Mostramos el valor actual de x
        System.out.println(campos.muestra());
    }


}