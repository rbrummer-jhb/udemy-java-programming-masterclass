package com.attempt;

public class Hamburger {
    private String name;
    private int basePrice;
    private int totalPrice;
    private int additions;
    private String breadRollType;
    private String meatType;
    private int amountLettuce;
    private int amountCheese;
    private int amountTomato;
    private int amountOnion;

    public Hamburger(int price, String breadRollType, String meatType) {
        this.name = "basic hamburger";
        this.basePrice = price;
        this.breadRollType = breadRollType;
        this.meatType = meatType;
    }

    public void addLettuce() {
        this.totalPrice += 1;

        if (this.additions == 4) {
            System.out.println("No more additions left.");
        }
        else {
            this.additions += 1;
        }
        this.amountLettuce += 1;
    }

    public void addCheese() {
        this.totalPrice += 4;

        if (this.additions == 4) {
            System.out.println("No more additions left.");
        }
        else {
            this.additions += 1;
        }
        this.amountCheese += 1;
    }

    public void addTomato() {
        this.totalPrice += 3;

        if (this.additions == 4) {
            System.out.println("No more additions left.");
        }
        else {
            this.additions += 1;
        }
        this.amountTomato += 1;
    }

    public void addOnion() {
        this.totalPrice += 2;

        if (this.additions == 4) {
            System.out.println("No more additions left.");
        }
        else {
            this.additions += 1;
        }
        this.amountOnion += 1;
    }

    public int getBasePrice() {
        return this.basePrice;
    }

    public int getTotalPrice() {
        return this.totalPrice + this.basePrice;
    }

    public int getAdditions() {
        return this.additions;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getLettucePrice() {
        return (this.amountLettuce + " x Lettuce : $" + (this.amountLettuce * 1));
    }

    public String getCheesePrice() {
        return (this.amountCheese + " x Cheese : $" + (this.amountCheese * 4));
    }

    public String getTomatoPrice() {
        return (this.amountTomato + " x Tomato : $" + (this.amountTomato * 3));
    }

    public String getOnionPrice() {
        return (this.amountOnion + " x Onion : $" + (this.amountOnion * 2));
    }

    public void getDetails() {
        System.out.println("Name : " + getName());
        System.out.println("Bread : " + getBreadRollType());
        System.out.println("Meat : " + getMeatType());
        System.out.println("Base price : $" + getBasePrice());
        System.out.println(getAdditions() + " x Additions");
        System.out.println(getLettucePrice());
        System.out.println(getCheesePrice());
        System.out.println(getTomatoPrice());
        System.out.println(getOnionPrice());
        System.out.println("Total price : $" + getTotalPrice());
    }
}
