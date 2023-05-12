package com.softtek.presentacion;

import com.softtek.modelo.Areas;

public class usoAreas {
    public static void main(String[] args) {
        //Instancia
        Areas area=new Areas();
        System.out.println("Area rectángulo:");
        area.setBase(3);
        area.setAltura(2);
        System.out.println(area.calcularAreaRectangulo(area.getBase(),area.getAltura()));

        System.out.println("");
        System.out.println("Area círculo:");
        area.setRadio(8);
        System.out.println(area.calcularAreaCirculo(area.getRadio()));

    }
}


