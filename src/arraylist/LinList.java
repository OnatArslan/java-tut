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
        removeElements(placesToVisit);
        System.out.println(placesToVisit);
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

}
