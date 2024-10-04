package pojo;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            /* id will be unique because of + 1 statement */
            RStudent s = new RStudent("S92300" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }, "05/11/1985", "Java Masterclass");
            System.out.println(s);

        }
        PojoStudent pojoStudent = new PojoStudent("100001", "Onat", "29/11/2001", "Python");
        RStudent recordStudent = new RStudent("100002", "Rugi", "01/01/2004", "Economy");

        System.out.println(pojoStudent.getName());
        System.out.println(recordStudent.name());
    }
}
