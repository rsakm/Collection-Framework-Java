package collection.listAndset.lists;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add("rajshree");
        ll.add("Priyaranjana");
        ll.add(30.47);
        System.out.println(ll);   //// [10, rajshree, Priyaranjana, 30.47]


        //// addFirst()
        //// getFirst()
        //// addLast()
        //// getLast()
        //// removeFirst()
        //// removeLast()

        ll.addFirst("RRR");
        ll.addLast("CCC");
        System.out.println(ll);

        ll.remove("Priyaranjana");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
