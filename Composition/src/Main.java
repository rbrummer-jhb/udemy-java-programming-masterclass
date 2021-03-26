public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        // inline instantiation of a class without using a variable
        Monitor theMonitor = new Monitor("27' Beast", "Acer", 27,
                new Resolution(2540, 1140));
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4, 6,
                "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
