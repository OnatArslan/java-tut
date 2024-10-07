package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(20);

        /* sort(array, firstIndex, toIndex) method is sort array by double pivot algorithm */
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[20];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 43);
        System.out.println(Arrays.toString(secondArray));

        /* Copy method gives a copy of array with given length */
        int[] thirdArray = Arrays.copyOf(secondArray, secondArray.length);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(secondArray));

        /* Binary search */
        String[] sArray = {"Abe", "John", "Adem", "Berlin", "Mustafa"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        System.out.println(Arrays.binarySearch(sArray, "Mustafa"));

        /* equals methods */
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.equals(s1, s2));

        Arrays.parallelSort(s1);
        System.out.println(Arrays.toString(s1));

        int[] testArr = {17, 12, 14, 15, 19, 28, 30};
        System.out.println(Arrays.toString(reverseSortArray(testArr)));

        /* Reverse for loop */
        for (int i = testArr.length - 1; i >= 0; i--) {
            System.out.println(testArr[i]);
        }

    }


    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static int[] reverseSortArray(int[] arr) {
        int[] returnThis = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            returnThis[arr.length - i - 1] = arr[i];
        }
        return returnThis;
    }
}
