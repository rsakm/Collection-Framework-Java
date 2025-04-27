package collection.cursors;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//// can be used with any collection object
public class IteratorCursor {
    public static void main(String[] args) {

        List li = new ArrayList();
        li.add(10);
        li.add(20);
        li.add("Rajshree");
        li.add("Maurya");
        li.add(30);

        System.out.println(li);    ////[10, 20, Rajshree, Maurya, 30]
        //// Prints the collection object as whole

        Iterator itr = li.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }      //// 10 20 Rajshree Maurya 30

        //// Prints each element of the collection one by one

        //// remove()

        li.remove(30);
    }
}
