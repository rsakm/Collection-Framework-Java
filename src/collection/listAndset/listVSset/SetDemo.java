package collection.listAndset.listVSset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set s = new HashSet();

        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        System.out.println(s);  //may or may not follow insertion order(Sequence)


        s.add(200);   //// Duplicate elements also occur only once in a set
        System.out.println(s);

        Iterator itr = s.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
