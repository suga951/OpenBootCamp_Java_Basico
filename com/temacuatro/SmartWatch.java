package com.temacuatro;

public class SmartWatch extends SmartDevice{

    public SmartWatch(){

    }
    public SmartWatch(String marca, String modelo, String color, int ram, int memoriaInterna){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ram = ram;
        this.memoriaInterna = memoriaInterna;
    }
}
