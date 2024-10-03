package oop;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mercedes", "C63AMG", "Onat", false, 300);
        car.setModel("BMW");
        System.out.println(car.getModel());
    }
}
