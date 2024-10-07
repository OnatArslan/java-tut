package arrays;

import java.util.Arrays;

public class MinElChal {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(readIntegers("1,2,3,4,5,6")));
        System.out.println(findMinInteger(readIntegers("1,2,3,4,5,6")));
    }

    public static int[] readIntegers(String numbersString) {
        String[] arrString = numbersString.split(",");
        int[] intArr = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            intArr[i] = Integer.parseInt(arrString[i]);
        }
        return intArr;
    }

    public static int findMinInteger(int... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
