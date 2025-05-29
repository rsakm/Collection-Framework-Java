package collection.listAndset.sets.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(40);
        ts.add(30);
        ts.add(60);
        ts.add(20);
        ts.add(10);
        System.out.println(ts);   /// Elements printed in Sorted order (TreeSet follows sorting order)

        TreeSet ts1 = new TreeSet();
        ts1.add("Rajshree");
        ts1.add("Sandeep");
        ts1.add("Alok");
        ts1.add("Rajesh");
        ts1.add("Shivam");
        System.out.println(ts1);


//        ts1.add(null);     // NullPointerException
//        ts1.add(20);       //ClassCastException: java.lang.String cannot be cast to java.lang.Integer

        ts.remove(20);
        System.out.println(ts);
        ts.clear();
        System.out.println(ts);
    }
}
