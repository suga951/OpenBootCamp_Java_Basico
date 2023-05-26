package com.temaseis;
//1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
public class uno {
    public static void main(String[] args) {

        String[] animales = {"Gatos", "Perros", "Conejos", "Ovejas", "Llamas", "Alpacas"};

        for (String animal :
                animales) {
            System.out.println(animal);
        }

    }
}
