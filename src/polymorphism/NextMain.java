package polymorphism;

import inheritance.Animal;

import java.util.ArrayList;
import java.util.List;

public class NextMain {
    public static void main(String[] args) {
        List<Integer> myListOfNumbers = new ArrayList<>();
        myListOfNumbers.add(19);
        myListOfNumbers.add(120);
        System.out.println(myListOfNumbers);
//      System.out.println(myListOfNumbers instanceof ArrayList<Integer>);
        Animal animal = new Animal("dog", "big", 1000902.2);
        System.out.println(animal);
    }
}
