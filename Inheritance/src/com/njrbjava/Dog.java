package com.njrbjava;

public class Dog extends Animal {
    // This Dog class has these distinct characteristics
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    // The Dog class also has these base characteristics
    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        // All dogs have a brain and a body
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        // The super class for this class is animal
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
