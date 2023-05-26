package com.temaseis;
import java.util.ArrayList;

//6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
//   A continuación, con otro bucle, recórrelo y elimina los numeros pares.
//   Por último, vuelve a recorrerlo y muestra el ArrayList final.
//   Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

public class seis {
    public static void main(String[] args) {
        ArrayList<Integer> arrayInts = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            arrayInts.add(i);
        }
        for (int i = arrayInts.size() - 1; i >= 0; i--) {
            if (arrayInts.get(i) % 2 == 0) {
                arrayInts.remove(i);
            }
        }

        System.out.println(arrayInts);
    }
}
