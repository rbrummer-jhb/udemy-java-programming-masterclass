package com.njrbjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = 0;
        int minNumber = 0;
         // this is the boolean flag
        boolean first = true;

        while (true) {
            System.out.println("Enter number:");

            if ( scanner.hasNextInt() ) {
                int number = scanner.nextInt();

                // this condition will only happen once in the loop
                if (first) {
                    first = false;
                    minNumber = number;
                    maxNumber = number;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

        scanner.close();
    }
}
