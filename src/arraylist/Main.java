package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples");
        groceryArray[2] = new GroceryItem("soda");
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("coffee"));
        groceryItems.add(new GroceryItem("butter"));
        groceryItems.add(new GroceryItem("yogurt"));

        System.out.println(groceryItems);
    }
}
