package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Aman";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Aman", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
