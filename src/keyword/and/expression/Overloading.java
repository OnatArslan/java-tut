package keyword.and.expression;

public class Overloading {
    public static void main(String[] args) {

        calculateScore("Onat", 92);
        calculateScore(89, "Rugi");

        int[] numArray = {1, 2, 3, 4, 5};
        sumOfArray(12, numArray);

        System.out.println(isPalindrome(122));
    }


    //    Methods with same name with different parameters does different things
    public static void calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score);
    }


    public static void calculateScore(int score, String playerName) {
        System.out.println("score " + score + " Player " + playerName);
    }


    public static void sumOfArray(int firstValue, int[] arr){
        int total = firstValue;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);

    }

    public static boolean isPalindrome(int number) {
        String reversedString = "";
        String stringRepNumber = Integer.toString(number);
        boolean isPalindrome = false;
        for (int i = stringRepNumber.length() - 1; i >= 0 ; i--) {
            reversedString += stringRepNumber.charAt(i);
        }
        System.out.println(reversedString.getClass());
        System.out.println(stringRepNumber.getClass());

        if(stringRepNumber.equals(reversedString)) {
            return true;
        }
        return isPalindrome;
    }
}
