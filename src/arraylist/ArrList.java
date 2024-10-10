package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        /* In paranthesis I give list to arraylist constructor and this will give me an arraylist with these items */
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

    }
}
