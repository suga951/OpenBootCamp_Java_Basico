package com.temaseis;
import java.io.*;

// 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
//    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
//    dado en "fileOut".
public class ocho {
    public static void main(String[] args) {
        File in = new File("C:\\JavaTests\\entrada.txt");
        File out = new File("C:\\JavaTests\\salida.txt");
        copiarFichero(in, out);
    }

    public static void copiarFichero(File fileIn, File fileOut) {

        try{
            InputStream inStr = new FileInputStream(fileIn);
            PrintStream prStr = new PrintStream(new FileOutputStream(fileOut));

            byte[] reader = new byte[1024];
            int readed;
            while((readed = inStr.read(reader)) != -1 ){
                prStr.write(reader, 0 , readed);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("El archivo fue copiado exitosamente!");
        }

    }
}
