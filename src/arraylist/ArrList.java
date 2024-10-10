package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        /* Create regular array */
        String[] items = {"apples", "bananas", "milk", "eggs"};

        /* Convert it to list type with List.of() function */
        List<String> list = List.of(items);
        System.out.println(list);

        /* In parenthesis, I give a list to arraylist constructor and this will give me an arraylist with these items */
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        /* Shorthand version*/
        ArrayList<String> myStringList = new ArrayList<>(List.of("Onat", "Rugi", "Coni", "Conitili"));
        myStringList.addAll(4, groceries);
        System.out.println(myStringList);

        /* get method */
        System.out.println(myStringList.get(2)); // It will get an element at 2. index

    }
}
