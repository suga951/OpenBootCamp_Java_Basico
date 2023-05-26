package com.temaseis;
import java.util.ArrayList;

//5. Crea un ArrayList de tipo String, con 4 elementos.
//   Cópialo en una LinkedList.
//   Recorre ambos mostrando únicamente el valor de cada elemento.

public class cinco {
    public static void main(String[] args) {

        ArrayList<String> arrL = new ArrayList<String>();

        arrL.add("Mazda");
        arrL.add("Nissan");
        arrL.add("Lexus");
        arrL.add("Toyota");

        for (String elem : arrL) {
            System.out.println(elem);
        }
    }
}
