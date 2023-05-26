package com.temaseis;
//9. Sorpréndenos creando un programa de tu elección que utilice
//InputStream, PrintStream, excepciones, un HashMap y un ArrayList,LinkedList o array.

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class nueve {
    public static void main(String[] args) {

        HashMap<Integer, String> empleadosMap = new HashMap<>();
        ArrayList<Integer> empleadosID = new ArrayList<>();

        try(InputStream inputStream = System.in;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            PrintStream outputStream = System.out){

            String input;
            do{
                mostrarMenu(outputStream);
                input = reader.readLine();

                switch(input){
                    case "1":
                        agregarEmpleado(reader,empleadosMap,empleadosID);
                        break;
                    case "2":
                        mostrarListaEmpleados(outputStream,empleadosMap,empleadosID);
                        break;
                    case "3":
                        buscarEmpleados(reader,empleadosMap,outputStream);
                        break;
                    case "4":
                        System.out.println("Hasta luego.");
                        break;
                    default:
                        outputStream.println("Por favor seleccione una opcion valida.");
                        break;
                }
            } while(!input.equals("4"));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void mostrarMenu(PrintStream outputStream){
        outputStream.println("Empleados");
        outputStream.println("1. Agregar Empleados");
        outputStream.println("2. Mostrar lista de Empleados");
        outputStream.println("3. Buscar empleado por ID");
        outputStream.println("4. Salir");
        outputStream.println("Elija una opcion: ");
    }
    private static void agregarEmpleado(BufferedReader reader,HashMap<Integer, String> empleadosMap,ArrayList<Integer>
                                        empleadosID) throws IOException{
        System.out.println("Ingrese el ID: ");
        int id = Integer.parseInt(reader.readLine());

        if(empleadosMap.containsKey(id)){
            System.out.println("El empleado con ID: " + id + "ya existe.");
        }else{
            System.out.println("Ingresa el nombre del empleado: ");
            String name = reader.readLine();
            empleadosMap.put(id,name);
            empleadosID.add(id);

            System.out.println("Empleado agregado exitosamente.");
        }

    }
    private static void mostrarListaEmpleados(PrintStream outputStream,HashMap<Integer,String> empleadosMap,ArrayList
                                              <Integer> empleadosID){
        outputStream.println("Lista de empleados:");

        for(int id : empleadosID){
            String nombre = empleadosMap.get(id);
            outputStream.println("ID: " + id + " , Nombre: " + nombre);
        }

    }
    private static void buscarEmpleados(BufferedReader reader, HashMap<Integer, String> empleadosMap,
                                        PrintStream outputStream) throws IOException{
        outputStream.println("Ingrese el ID del empleado a buscar: ");
        int id = Integer.parseInt(reader.readLine());
        String nombre = empleadosMap.get(id);

        if(nombre != null){
            outputStream.println("Empleado ID: " + id + " , Nombre: " + nombre + ".");
        }else{
            outputStream.println("No existe empleado asociado a el numero dado.");
        }
    }
}
