package com.softtek.presentacion;

import com.softtek.modelo.Dado;

import java.util.Scanner;

public class usoDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado miDado = new Dado();
        System.out.println("El número del dado es: " + miDado.getNumero());
        miDado.lanzar();

        System.out.print("¿Quieres lanzar otro dado? (S/N): ");
        String respuesta = sc.nextLine();
        while (respuesta.equalsIgnoreCase("S")) {
            miDado.lanzar();
            System.out.println("El número del dado es: " + miDado.getNumero());
            System.out.print("¿Quieres lanzar otro dado? (S/N): ");
            respuesta = sc.nextLine();
        }
            System.out.println("Bye Bye");


    }
}
