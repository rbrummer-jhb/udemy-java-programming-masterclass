package com.attempt;

public class DeluxeBurger extends Hamburger {
    private String name;

    public DeluxeBurger(int price, String breadRollType, String meatType) {
        super(price, breadRollType, meatType);
        this.name = "deluxe hamburger";
    }
}
