package njrbjava.com;

public class Main {
    // Encapsulation is the mechanism that allows you to restrict access to
    // certain components in the created objects. You protect the members of
    // a class from external access.

    public static void main(String[] args) {
        // This class does not use Encapsulation
//        Player player = new Player();
//        player.fullName = "Slayer";
//        player.weapon = "Rapier";
//        player.health = 20;
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Slayer", 200, "Scythe");
        // This getter is the only way of getting access to the health
        // By making the class fields private, the class and it's fields are
        // not accessible by any other classes outside.
        System.out.println("Initial health is " + player.getHealth());
    }
}