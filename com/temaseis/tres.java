package com.temaseis;
import java.util.Vector;

//3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
//   Elimina el 2.º y 3.er elemento y muestra el resultado final.

public class tres {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add(0, "Elemento 1");
        vector.add(1, "Elemento 2");
        vector.add(2, "Elemento 3");
        vector.add(3, "Elemento 4");
        vector.add(4, "Elemento 5");


        vector.remove(2);
        vector.remove(3);

        System.out.println("Nuestro vector queda: " + vector);
    }
}
