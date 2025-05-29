package collection.listAndset.sets.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("Rajshree");

        hs.add("Rajshree");
        System.out.println(hs);

        hs.add(463);
        hs.add("Samastipur");
        System.out.println(hs);

        Iterator itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        ArrayList al = new ArrayList();
        al.add("Raj");
        al.add("Shree");
        al.add("Samastipur");
        HashSet hs1 = new HashSet(al);
        hs.add("Rajshree");
        hs1.add(92.6);
        System.out.println(hs1);
        hs1.clear();
        System.out.println(hs1);

        System.out.println(hs.contains("rajshree"));
        System.out.println(hs.size());

    }
}
