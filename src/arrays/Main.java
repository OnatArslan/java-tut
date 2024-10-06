package arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        String[] names = new String[10];

        names[2] = "Rugi";
        numbers[2] = 1990;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] names2 = {"Onat", "Rugi", "Coni", "Charles"};

        int numbers2Length = numbers2.length;
        System.out.println("Length of number2 array is: "+ numbers2Length);

        System.out.println("The last element of names2 array is: " + names2[names2.length -1]);

        int accumulator = 0;
        for (int i = 0; i < numbers2.length; i++) {
            accumulator += numbers2[i];
        }
        System.out.println(accumulator);
    }
}
