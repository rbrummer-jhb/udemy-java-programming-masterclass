package com.njrbjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scanner will parse the integer for us
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2021 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age +
                " years old.");

        // close the scanner after using it so it can
        // release the underlying memory it was using
        scanner.close();
    }
}
