package com.njrbjava;

public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        String numberFactors = "";
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                numberFactors += i + " ";
            }
        }
        System.out.println(numberFactors);
    }
}
