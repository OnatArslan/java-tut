package strings;

public class Main {
    public static void main(String[] args) {

        /* This is an old way of format string*/
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub point
                """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d\n",age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d\n",age, yearOfBirth);

        double doubleNumber = 198.000987;
        /* %f means double or float number is formatted and .2 or .x notation is I want x number after 0 */
        System.out.printf("Your number is %.2f",doubleNumber);
    }
}
