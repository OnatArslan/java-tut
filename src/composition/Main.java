package composition;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("lx32", "samsung", 32, "1080");
        Motherboard motherboard = new Motherboard("msixt6", "msi", 4, 12, "amd");
        ComputerCase computerCase = new ComputerCase("zeus100", "asus", "doom");

        PersonalComputer personalComputer = new PersonalComputer("gamer", "me", monitor, motherboard, computerCase);

        System.out.println(personalComputer.getComputerCase());
        System.out.println(personalComputer.getMonitor());
        System.out.println(personalComputer.getMotherboard());
    }
}
