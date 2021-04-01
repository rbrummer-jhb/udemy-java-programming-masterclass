package com.njrbjava;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car : startEngine()";
    }

    public String accelerate() {
        return "Car : accelerate()";
    }

    public String brake() {
        return "Car : brake()";
    }
}

class BMW extends Car {
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW : startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW : accelerate()";
    }

    @Override
    public String brake() {
        return "BMW : brake()";
    }
}

class Merc extends Car {
    public Merc(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Merc : startEngine()";
    }

    @Override
    public String accelerate() {
        return "Merc : accelerate()";
    }

    @Override
    public String brake() {
        return "Merc : brake()";
    }
}

class Audi extends Car {
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi : startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi : accelerate()";
    }

    @Override
    public String brake() {
        return "Audi : brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMW bmw = new BMW(6, "M3");
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Merc merc = new Merc(6, "GLA220");
        System.out.println(merc.startEngine());
        System.out.println(merc.accelerate());
        System.out.println(merc.brake());

        Audi audi = new Audi(6, "TT");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
    }
}
