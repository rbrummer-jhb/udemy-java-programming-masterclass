public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    // Inheritance deals with a 'Is A' relationship
    // A Car is a Vehicle

    // Composition deals with a 'Has A' relationship
    // A Computer has a case, motherboard, monitor etc

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
