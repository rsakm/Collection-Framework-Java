package maps.hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(101, "ABC");  /// Entry
        hm.put(102,"DEF");
        hm.put(103,"GHI");
        hm.put(104, 567);

        System.out.println(hm);

        Set set = hm.entrySet();
        System.out.println(set);

        Iterator itr = set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        itr = set.iterator();  // Reset the iterator


        while (itr.hasNext()){
//            System.out.println(itr.next());

            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" -> "+entry.getValue());

        }


//        When we use generics then the key nd values can be get directly as:

        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(101, "Rajshree");  /// Entry
        hm1.put(102,"Priyaranjana");
        hm1.put(103,"Shivam");
        hm1.put(104, "Samastipur");

        for (Map.Entry me: hm1.entrySet()){
            System.out.println(me.getKey()+" -> "+me.getValue());
        }






    }
}
