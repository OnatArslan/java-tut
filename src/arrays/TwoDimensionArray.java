package arrays;

import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {

        int[][] twoDimensionArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        outer:
        for (int i = 0; i < twoDimensionArray.length; i++) {
            System.out.println("Outer array index is "+ i+ " outer element is "+ Arrays.toString(twoDimensionArray[i]));
            inner:
            for (int i1 = 0; i1 < twoDimensionArray[i].length; i1++){
                System.out.println("Inner index is "+i1+" element is " + twoDimensionArray[i][i1]);
                System.out.printf("Element is %d at index [%d, %d] %n",twoDimensionArray[i][i1], i, i1);
            }
        }
        System.out.println(Arrays.deepToString(twoDimensionArray));
    }
}
