package inheritance;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, String size, double weight, int gills, int fins) {
        super(type, size, weight);
        this.gills = gills;
        this.fins = fins;
    }


    private void moveMuscles() {
        System.out.println(type+" is moving muscles");
    }
    private void moveBackFins(){
        System.out.println(type+" is moving back fins");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println(type + " moving into the ocean...");
    }
}
