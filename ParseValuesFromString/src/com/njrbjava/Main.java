package com.njrbjava;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2021.125";
        System.out.println("numberAsString = " + numberAsString);

        // this uses the 'Integer' wrapper class
        // int number = Integer.parseInt(numberAsString);

        // this uses the 'Double' wrapper class
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        // this will concatenate 1
        numberAsString += 1;
        // this will add 1
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
