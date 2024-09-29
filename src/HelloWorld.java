import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Onat");

        Date curDate = new Date();
        System.out.println(curDate.toString());

        int[] numbers = {90, 130, 10, 3, 4};
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
        int num = 17;
        boolean biggerThan = num > 13 ? false : true;
        System.out.println(biggerThan);
        boolean isAlient = false;

        if (!isAlient) {
            System.out.println("It is not an alien");
        }
    }
}
