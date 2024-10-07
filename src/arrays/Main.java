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
        for (int num : numbers2) {
            accumulator += num;
        }
        System.out.println(accumulator);
        /* Give values to array after initialization*/
        int[] newArray;
//        newArray = new int[]{5, 4, 3, 2, 1, 0};
        newArray = new int[]{29, -190, -133, 197, 1, 10002, -980, 2, 7, 11, -12};

        for(int element : newArray){
            System.out.println(element);
        }

        System.out.println(Arrays.toString(newArray)); // Arrays.toString() must use for string representation

        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
    }
}
