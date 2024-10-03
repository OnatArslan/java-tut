package oop;

public class Car {
    private String brand;
    private String model;
    private String ownerName;
    private boolean isOpen;
    private int topSpeed;

    public Car(String brand, String model, String ownerName, boolean isOpen, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.ownerName = ownerName;
        this.isOpen = isOpen;
        this.topSpeed = topSpeed;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", isOpen=" + isOpen +
                ", topSpeed=" + topSpeed +
                '}';
    }
//    My methods
    public void openCar(){
        System.out.println(!this.isOpen);
        if(!this.isOpen){
            this.isOpen = true;
            System.out.println("Car opened");
        }else{
            System.out.println("Car is already open");
        }
    }

}
