package collection.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//// Used with only list implemented classes: ArrayList, LinkedList, vector & Stack
public class ListIteratorCursor {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(10);
        li.add(20);
        li.add("Rajshree");
        li.add("Maurya");
        li.add(30);

        System.out.println(li);    ////[10, 20, Rajshree, Maurya, 30]
        //// Prints the collection object as whole

        ListIterator litr = li.listIterator();
        while (litr.hasNext()){   //// forward
            System.out.print(litr.next()+" : Forward traversal ");
        }
        System.out.println("\n--------------------------------------------------");
        while (litr.hasPrevious()){   /// backward
            System.out.print(litr.previous()+" : Backward traversal");
        }

        /// add
        li.add(40);

        //// remove
        li.remove(10);

        /// set
        li.set(0,15);   //// 0 index ---> 15

    }
}
