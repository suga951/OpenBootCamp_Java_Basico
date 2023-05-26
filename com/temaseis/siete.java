package com.temaseis;

//7. Crea una función DividePorCero.
//   Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada
//   por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
//   mostraremos el mensaje "Esto no puede hacerse".
//   Finalmente, mostraremos en cualquier caso: "Demo de código".

import javafx.scene.control.SplitPane;

public class siete {
    public static void main(String[] args) {
        try{
            DividePorCero(20,0);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally{
            System.out.println("Demo de codigo");
        }
    }
    public static void DividePorCero(int dividendo, int divisor) throws ArithmeticException{
        if(divisor == 0){
            throw new ArithmeticException("Esto no puede hacerse");
        }
        int resultado = dividendo/divisor;
        System.out.println(resultado);
    }
}
