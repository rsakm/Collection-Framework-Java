package maps.treeMaps;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap();
        tm.put(1,"Ashesh");
        tm.put(2,"Milan");
        tm.put(3,"Sundaram");
        tm.put(4,"Rajshree");
        tm.put(16,"Priyaranjana");
        tm.put(6,"Mukund");
        System.out.println(tm);

        System.out.println();

        TreeMap tm1 = new TreeMap();
        tm1.put("Ashesh",1);
        tm1.put("Milan",2);
        tm1.put("Sundaram",3);
        tm1.put("Rajshree",4);
        tm1.put("Priyaranjana",16);
        System.out.println(tm1);

        System.out.println(tm.ceilingEntry(3));   /// Found (Key = 3) so returns the entry
        System.out.println(tm.ceilingEntry(5));  //// Not found key 5, so returns the nearest greater key and value pair (6)
        System.out.println(tm.ceilingEntry(7));


        System.out.println(tm.ceilingKey(7));
        System.out.println(tm.ceilingKey(3));

        System.out.println(tm.headMap(6));
        System.out.println(tm.higherEntry(6));
        System.out.println(tm.higherEntry(3));
        System.out.println(tm.higherEntry(16));   ///null

        System.out.println(tm.keySet());
        System.out.println(tm.pollFirstEntry());   ///returns first entry and remove it from map
        System.out.println(tm);

        System.out.println(tm.subMap(4,17));

    }
}
