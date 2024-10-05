package inheritance;

public class Main {
    public static void main(String[] args) {
        /* Create parent class */
        Animal animal = new Animal("animal", "small", 10.2);
        Dog dog = new Dog("labrador", 12.90, "sharp", "short");
        doAnimalStuff(animal, "slow");
        System.out.println("-------------------------");
        doAnimalStuff(dog, "fast");

        Fish fish = new Fish("shark", "huge", 300.980, 8, 2);
        doAnimalStuff(fish, "fast");
        System.out.println(fish);

        fish.move("fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
