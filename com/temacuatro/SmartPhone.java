package com.temacuatro;

public class SmartPhone extends SmartDevice{

    public SmartPhone(){

    }
    public SmartPhone(String marca, String modelo, String color, int ram, int memoriaInterna){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ram = ram;
        this.memoriaInterna = memoriaInterna;
    }
}
