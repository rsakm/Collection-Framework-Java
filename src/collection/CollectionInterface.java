package collection;

import java.util.ArrayList;

//// Collection is an interface
public class CollectionInterface {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
//        // al is a collection object

//        Collection methods
        al.add(10);
        al.add("Rajshree");
        al.add('R');

        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(20);
        al2.add(30);
        al2.add(40);

//        // Add all objects of a collection to another collection object

        al.addAll(al2);
        System.out.println(al);
        System.out.println(al2);

//// add() method returns boolean value
        System.out.println(al.add("raj"));  ///true

//        contains() method
        System.out.println(al.contains(200));

//        isEmpty() method

//        size() method

//// remove method
//        takes object as an input but integer is counted as index
        al.remove("raj");
//        al.remove(10);   //// ArrayIndexOutofbound

//        // removeAll(Collection c)
        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al2);
//// clear()   ----> Deletes all elements of a collection
//        Ex---> al.clear();
    }
}
