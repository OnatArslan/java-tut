package inheritance;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        /* Super() constructor is parent class constructor !!! */
        super(type, size, weight);
        /* Field at belong are special fields for Dog(child) class not Animal(parent) class */
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
}
