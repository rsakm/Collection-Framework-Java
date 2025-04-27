package collection.cursors;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(10);
        v.add("Rajshree");
        v.add(14.69);

        System.out.println(v);     ////[10, Rajshree, 14.69]

        Enumeration en = v.elements();
        while (en.hasMoreElements()){
            System.out.print(en.nextElement()+" ");  ///// 10 Rajshree 14.69
        }
    }
}
