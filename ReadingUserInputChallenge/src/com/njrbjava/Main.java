package com.njrbjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (count < 10) {
            int order = count + 1;

            System.out.println("Enter number #" + order + ":");

            if ( scanner.hasNextInt() ) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Total = " + sum);
        scanner.close();
    }
}
