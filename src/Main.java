import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("First java code this year");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

//        Example of java callback
        numbers.forEach(number -> {
            System.out.println(number + 1);
        });

        for(int number : numbers){
            System.out.println(number);
        }

        System.out.println(isEven(12));
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }


}