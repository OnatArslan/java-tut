package encapsulation;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Rugi", 20, "sword");



        player.health = 10000;
        System.out.println(player.health);


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Onat", 100, "pistol");
        System.out.println(enhancedPlayer);

        Printer duplexPrinter = new Printer(120, 0, true);
        Printer nonDublexPrinter = new Printer(120, 0, false);

        duplexPrinter.printPages(124);
        System.out.println(duplexPrinter.getPagesPrinted());
        System.out.println(duplexPrinter.getPagesPrinted());

        nonDublexPrinter.printPages(980);
        System.out.println(nonDublexPrinter.getPagesPrinted());
        System.out.println(nonDublexPrinter.getPagesPrinted());
    }
}
