import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("First java code this year");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));


        numbers.forEach(number -> {
            System.out.println(number + 1);
        });

        for(int number : numbers){
            System.out.println(number);
        }

        System.out.println(isEven(12));

        String myName = "Onat";
        System.out.println("Hey! Welcome to our app "+ myName);
//        Java is good
        User firstUser = new User(1, "Onat", "Arslan", "onatarslan@gmail.com");
        firstUser.setName("Rugi");
        System.out.println(firstUser);
        long maxLongNumber = Long.MAX_VALUE;
        System.out.println("Maximum value of long data type is: "+maxLongNumber);
        System.out.println("Maximum value of long data type is: "+maxLongNumber);
        System.out.println("Maximum value of long data type is: "+maxLongNumber);
        System.out.println(firstUser.getFullName());

        String a , b;
        int c = 20;
        a = "Adana";
        System.out.println(a.getClass().getSimpleName());


//        Type casting
        byte myByte = (byte) (Byte.MAX_VALUE / 2);
        System.out.println(myByte);
        System.out.println(myByte);
        System.out.println(myByte);
        System.out.println(myByte);
        System.out.println(myByte);
        System.out.println(myByte);
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }


}