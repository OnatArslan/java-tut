package abstractclass;

import java.util.Objects;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        if (Objects.equals(this.type, "wolf")) {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
/* Comment for override method example */
/* Comment for override method example */
/* Comment for override method example */
/* Comment for override method example */
/* Comment for override method example */
/* Comment for override method example */
    @Override
    public void move(String speed) {
        System.out.println("Dog is moving "+speed);
    }

// Comment for changes
}
