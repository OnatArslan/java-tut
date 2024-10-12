package arraylist;

import java.util.LinkedList;

public class LinList {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        /* Queue methods */
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        /* Stack methods */
        list.push("Alice Springs");
    }


    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
    }


    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved element = " + list.get(4));

        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());

        System.out.println("Darwin is at position " + list.indexOf("Darwin"));
        /* Queue retrieval method */
        System.out.println("Element from element() = " + list.element());
    }
}
