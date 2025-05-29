package maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(01, "Rajshree");
        map.put(16, "Priyaranjana");
        map.put(2,"Milan");
        map.put(141, "Rajshree");

        System.out.println(map);        ///{16=Priyaranjana, 1=Rajshree, 2=Milan, 141=Rajshree}

        map.put(16, "P jha");
        System.out.println(map);    /// the corresponding value of duplicate key has been overridden
        System.out.println(map.containsKey(141)); ///true
        System.out.println(map.entrySet());    /// returns the set view of the mappings:   [16=P jha, 1=Rajshree, 2=Milan, 141=Rajshree]


        System.out.println(map.get(16));
        map.replace(16, "Priyaranjana");
        System.out.println(map);
        System.out.println(map.size());
        map.replace(131, "Piyush");   /// Key not found, so map is unchanged
        System.out.println(map);

        map.put(null, null);
        System.out.println(map);

    }
}
