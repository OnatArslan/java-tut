package arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinList {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
//        printItinerary(placesToVisit);
//        listIterator(placesToVisit);

        testIterator(placesToVisit);
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

        System.out.println("Element from peek() = " +list.peek());
        System.out.println("Element from peek() = " +list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at "+ list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: "+list.get(i-1)+ " to " +list.get(i));
        }
        System.out.println("Trip ends at "+ list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at "+ list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at "+ list.getLast());
    }

    public static void listIterator(LinkedList<String> list) {
        System.out.println("Trip starts at "+ list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {

            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at "+ list.getLast());
    }


    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());

        }
        System.out.println(list);

        var iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous()+ " " + (iterator2.previousIndex() + 1));
        }
        System.out.println(list);
    }

}
