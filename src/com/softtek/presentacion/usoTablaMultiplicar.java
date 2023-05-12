package com.softtek.presentacion;

import com.softtek.modelo.TablaMultiplicar;

public class usoTablaMultiplicar {
    public static void main(String[] args) {
        TablaMultiplicar miTabla=new TablaMultiplicar(5);
        miTabla.setNumero(5);
        System.out.println("Tabla del " + miTabla.getNumero());
        System.out.println("");
        System.out.println(miTabla.mostrarTabla());
    }
}
