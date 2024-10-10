package arraylist;

import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

    }
}
