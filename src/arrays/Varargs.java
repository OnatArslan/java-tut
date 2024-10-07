package arrays;

public class Varargs {
    public static void main(String[] args) {
        /* String[] args means args is array made of Strings */
        /* This can be done with String... args */

        String[] splitStrings = "Hello World again".split(" ");


        /* With ... notation we can give parameters like this */
        printText(4,"Hello", "From", "The", "Other", "World");

        /* String.join(delimiter, arr) method */
        String[] sampleArray = {"This", "Is", "String", "For", "Join"};

        String sampleString = String.join("", sampleArray);
        System.out.println(sampleString);
    }

    /* When can you use variable arguments ...*/
    /* Each method can take only one variable argument */
    /* Variable arg must be the last argument */
    private static void printText(int repeat,String... textlist) {
        for (int i = 0; i < textlist.length; i++) {
            System.out.println(textlist[i].repeat(repeat));
        }
    }
}
