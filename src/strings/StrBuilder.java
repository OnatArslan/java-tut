package strings;

import java.util.ArrayList;
import java.util.Comparator;

public class StrBuilder {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        /* String can not change but stringBuilder can change*/
        helloWorld.concat("and Goodbye");
        helloWorldBuilder.append("and Goodbye");
        System.out.println(helloWorld); // Hello World
        System.out.println(helloWorldBuilder); // Hello World and Goodbye

        /* String methods return new String */
        /*  builder methods return a String builder but this is a self-reference*/

        /* Special string builder methods */
        StringBuilder newString = new StringBuilder("We must reverse this string");
        /* reverse() */
        newString.reverse();
        System.out.println(newString);

        /* insert() add string to given index(offset)*/
        newString.insert(3, "hello");
        System.out.println(newString);

        /* delete() or deleteCharAt() */
        StringBuilder secStr = new StringBuilder("Onat Arslan");
        secStr.delete(6, 8);
        secStr.deleteCharAt(0);
        System.out.println(secStr);

        secStr.replace(1, 5, "G");
        System.out.println(secStr);

    }
}
