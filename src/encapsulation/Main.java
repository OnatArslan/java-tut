package encapsulation;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Rugi", 20, "sword");

        player.health = 10000;
        System.out.println(player.health);


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Onat", 100, "pistol");
        System.out.println(enhancedPlayer);
    }
}
