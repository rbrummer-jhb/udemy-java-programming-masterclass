package com.attempt;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(10, "white", "chicken");
        hamburger.addLettuce();
        hamburger.addCheese();
        hamburger.addTomato();
        hamburger.addOnion();
        hamburger.getDetails();

        System.out.println("\n");

        Hamburger burger = new Hamburger(10, "brown", "beef");
        burger.addLettuce();
        burger.addCheese();
        burger.addTomato();
        burger.addOnion();
        burger.getDetails();

        System.out.println("\n");

        HealthyBurger healthyBurger = new HealthyBurger(11, "rye", "chicken");

    }
}
