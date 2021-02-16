package com.njrbjava;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account("12345", 0.0,
//                "Bruce Wayne", "thebat@wayne.com",
//                "555-4321");

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.0);
        bobsAccount.setCustomerName("Bruce Wayne");
        bobsAccount.setCustomerEmailAddress("thebat@wayne.com");
        bobsAccount.setCustomerPhoneNumber("555-4321");

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
    }
}
