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
    }
}
