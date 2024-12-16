package CollectionDemo;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        List.add("Rutuja");
        List.add("Arati");
        List.add("Pooja");
        List.add(null);
        List.add(10.5f);
        //System.out.println(List.getFirst());
        //System.out.println(List.getLast());
        List.removeFirst();
        List.removeLast();
        List.addFirst(100);
        List.addLast("Rahul");
        for (Object s : List) {
            System.out.println(s);

        }
    }
}