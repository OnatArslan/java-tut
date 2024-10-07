package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {87, 93, 100, 1000, 1, 2};
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }

    public static int[] reverseArray(int... numbers) {
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[numbers.length - i - 1] = numbers[i];
        }
        return reversedNumbers;
    }
}
