package com.temacinco;

public class Main {
    public static void main(String[] args) {

        CocheCRUDImpl cocheObj = new CocheCRUDImpl();


        cocheObj.delete();
        cocheObj.findAll();
        cocheObj.save();

    }
}

