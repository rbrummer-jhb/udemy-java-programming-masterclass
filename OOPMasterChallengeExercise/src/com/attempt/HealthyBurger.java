package com.attempt;

public class HealthyBurger extends Hamburger {
    private String name;

    public HealthyBurger(int price, String breadRollType, String meatType) {
        super(price, breadRollType, meatType);
        this.name = "healthy hamburger";
    }

    public String getName() {
        return name;
    }
}
