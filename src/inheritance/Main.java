package inheritance;

public class Main {
    public static void main(String[] args) {
        /* Create parent class */
        Animal animal = new Animal("duck", "small", 10.2);
        Dog dog = new Dog("pitbull", "medium", 22.90, "sharp", "short");

        doAnimalStuff(dog, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
