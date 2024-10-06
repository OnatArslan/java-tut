package arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        String[] names = new String[10];

        names[2] = "Rugi";
        numbers[2] = 1990;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
    }
}
