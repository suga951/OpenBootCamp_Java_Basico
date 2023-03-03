package com.temados;

public class temaDos {

    public static void main(String[] args) {

        double precio = 199.95d;


        System.out.println("El precio con IVA es de: " + valorTotal(precio));
        System.out.println("El IVA es de: " + iva(precio));
    }
    static double iva(double valor){
        return (valor/100) * 21;
    }
    static double valorTotal(double precio){
        double total = iva(precio) + precio;
        return total;
    }
}
