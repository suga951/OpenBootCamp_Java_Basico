package com.temaseis;
//2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
//   el valor de cada elemento en ambas dimensiones.
public class dos {
    public static void main(String[] args) {

        int[][] nums = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {100, 200, 300, 400, 500},
                {1000, 2000, 3000, 4000, 5000}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println("El valor del elemento es: " + nums[i][j]);
                System.out.println("Esta en la posicion: " + "[" + i + "]" + "[" + j + "]");
            }
        }


    }
}
