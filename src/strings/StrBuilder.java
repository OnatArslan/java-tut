package strings;

public class StrBuilder {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        /* String can not change but stringBuilder can change*/
        helloWorld.concat("and Goodbye");
        helloWorldBuilder.append("and Goodbye");
        System.out.println(helloWorld); // Hello World
        System.out.println(helloWorldBuilder); // Hello World and Goodbye
    }
}
