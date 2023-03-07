package com.temacuatro;

public class Main {
    public static void main(String[] args) {

        //Constructores
        SmartDevice smartTv = new SmartDevice();
        SmartDevice xiaomi = new SmartPhone();
        SmartDevice appleWatch = new SmartWatch();

        smartTv.marca = "LG";
        xiaomi.modelo = "12 Pro";
        appleWatch.color = "Blanco";

        System.out.println(smartTv.marca);
        System.out.println(xiaomi.modelo);
        System.out.println(appleWatch.color);

        //Constructores con parametros

        SmartDevice ipad = new SmartDevice("Apple","Pro","Negro",8,512);
        SmartPhone iphone = new SmartPhone("Apple","13 Pro Max","Azul",6,512);
        SmartDevice galaxyWatch = new SmartWatch("Samsung","5 Pro", "Negro", 1,16);

        System.out.println(ipad.color);
        System.out.println(iphone.modelo);
        System.out.println(galaxyWatch.marca);




    }
}
