package collection.listAndset.vectors;

import java.util.Vector;
public class Main {
    public static void main(String[] args) {

        Vector v = new Vector<>();
        v.add("Rajshree");
        v.add(1,21);
        v.addElement("Patna");
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.add(463);
        v.add(92.6);
        System.out.println(v);

        Vector v1 = new Vector<>(v);
        Vector v2 = new Vector<>(2);
        Vector v4 = new Vector<>(5,1/2);
    }
}
