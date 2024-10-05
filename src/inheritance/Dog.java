package inheritance;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight, String earShape, String tailShape) {
        /* Super() constructor is parent class constructor !!! */
        super(type, weight < 15 ? "small" : (weight < 30 ? "medium" : "large"), weight);
        /* Field at belong are special fields for Dog(child) class not Animal(parent) class */
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("bark bark");
    }
}
