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



    }
}
