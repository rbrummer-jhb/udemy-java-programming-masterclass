package com.njrbjava;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        holden.setModel("Commodore");
        System.out.println("Model is " + holden.getModel());
    }
}
