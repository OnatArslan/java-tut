package strings;

public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";

        /* Start index of given string or char */
        System.out.println(birthDate.indexOf("1982"));

        /* Like slice method 10. index not included */
        System.out.println(birthDate.substring(6,10));

        /* replace first chat with second char*/
        System.out.println(birthDate.replace("2", "4"));

        /* Join method (static) joins ...elements with delimiter parameter*/
        String newDate = String.join("/", "25", "11", "2001");
        System.out.println(newDate);

        String[] arr = birthDate.splitWithDelimiters("/",3);
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("ABC\n".repeat(3).indent(10));
        System.out.println("-".repeat(30));
        System.out.println("ABC\n".repeat(3));
    }
}
