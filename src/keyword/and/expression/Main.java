package keyword.and.expression;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String name = "Onat Arslan";
        String upperName = name.toUpperCase();
        int indexOfA = name.indexOf("A");
        System.out.println("upperName = " + upperName);
        System.out.println("indexOfA = " + indexOfA);

        List<String> brands = new ArrayList<>();
        brands.add("Volvo");
        brands.add("Mercedes");
        brands.add("Bmw");
        brands.add("Opel");
        for (String brand : brands) {
            System.out.println(brand.startsWith("V"));
        }

        for (int index = 0; index < brands.size(); index++) {
            System.out.println("Element "+brands.get(index)+" at index: "+ index);
        }

        String[] names = {"Onat","Rugi","Coni"};


        for (String n : names) {
            System.out.println(n);
        }
    }


}

