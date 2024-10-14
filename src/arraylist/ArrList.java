package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        /* contains method */
        if (myStringList.contains("Coni")) {
            System.out.println("Hello Coni");
        }

        /* indexOf method return index of an element if found else it will return -1 */
        System.out.println(myStringList.indexOf("Coni")); // 2
        System.out.println(myStringList.indexOf("Horse")); // -1

        /* lastIndexOf method returns last value's index if value repeats more than one*/
        myStringList.add(6, "Coni");
        System.out.println(myStringList.indexOf("Coni")); // 2
        System.out.println(myStringList.lastIndexOf("Coni")); // 6

        /* remove by index and remove by value*/
        System.out.println(myStringList);
        myStringList.remove(4);
        myStringList.add("Calculator");
        System.out.println(myStringList);
        myStringList.remove("eggs");
        System.out.println(myStringList);
        /* remove and retain all with List.of() function */
        myStringList.removeAll(List.of("milk", "yogurt"));
        System.out.println(myStringList);
        myStringList.retainAll(List.of("bananas"));
        System.out.println(myStringList);

        /* clear all the list */
        myStringList.clear();
        System.out.println(myStringList);

        if (myStringList.isEmpty()) {
            System.out.println("myStringList is empty!");
            System.out.println("This is fine");
//            All
            System.out.println("Hello");
        }

        /* This is a creation or adding with List.of() method*/
        ArrayList<String> family = new ArrayList<>(List.of("Onitoli", "Onat", "Rugi", "Rugitoli","Coni", "Conitoli"));
        System.out.println(family);

        family.addAll(Arrays.asList("Rugrugi", "Bokitoli", "Adem", "Zeynep"));
        System.out.println(family);

        System.out.println("--------------------------------------");
        /* SORT METHODS */
        System.out.println(family);
//
        family.sort(Comparator.naturalOrder());
        System.out.println(family);
        family.sort(Comparator.reverseOrder());
        System.out.println(family);

        System.out.println(family.reversed());
//        returns reversed a version of a list

        /* Convert an array list to array */
        String[] familyArray = family.toArray(new String[family.size()]);
        System.out.println(Arrays.toString(familyArray));
        System.out.println("Print them out");
    }




}
