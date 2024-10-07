package arrays;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {

        int[][][] threeDimArray = new int[4][4][4];

        System.out.println(Arrays.deepToString(threeDimArray));

        first:
        for (int i = 0; i < threeDimArray.length; i++) {
            System.out.println("In first loop");
            int[][] middleArray = threeDimArray[i];
            middle:
            for (int j = 0; j < middleArray.length; j++) {
                System.out.println("In middle loop");
                int[] innerArray = middleArray[i];
                inner:
                for (int k = 0; k < innerArray.length; k++) {
                    System.out.println("In inner loop");
                    System.out.printf("Element %d index at [%d, %d, %d] %n",innerArray[k], i,j,k);
                }
            }
        }
    }
}
