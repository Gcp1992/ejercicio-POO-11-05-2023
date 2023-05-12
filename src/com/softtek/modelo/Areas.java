package com.softtek.modelo;

public class Areas {
    private double radio;
    private static double PI=3.141592653589793238;
    private int base;
    private int altura;

    public Areas() {

    }

    public static double calcularAreaCirculo(double radio) {
        return PI * Math.pow(radio, 2);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Areas.PI = PI;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "radio=" + radio +
                ", PI=" + PI +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
