package collection.listAndset.listVSset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(0,10);   //// Index based dataStructure

//        li.add(2,20);   //// Array Index Out of bound as li is of length 1 only

        li.add(1,20);
        li.add(2,30);
        System.out.println(li);   ////Follows insertion order
        //// [10, 20, 30]

        li.add(20); //// Duplicate elements are allowed

//        // list interface has a method iterator()
        Iterator itr = li.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");   /// 10 20 30
        }


    }
}
