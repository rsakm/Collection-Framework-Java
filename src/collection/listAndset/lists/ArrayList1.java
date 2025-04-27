package collection.listAndset.lists;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();


        al1.add(10);
        al1.add(20);
        al1.add("Rajshree");

        al1.add(3,30);
        System.out.println(al1);


        ArrayList al2 = new ArrayList<>(al1);
        al2.add(100);
        al2.add(200);
        al2.add(300);

        System.out.println(al2);

//        // addAll() method
//        // remove()
        al2.remove(3);
        al2.remove("Rajshree");
        System.out.println(al2);
//
//        //removeAll() method

        //// clear() method
        //// .contains() method ---> returns boolean
        //// size()  ---> number of elements

        al1.get(2);   /// returns object element from index 2
        al1.set(2,600); /// sets 600 at index 2 element

        //// indexOf()

    }
}
