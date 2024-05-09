package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo { // Map is not part of collections , map extends set.

    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        hm.put("Arjit", 23);
        hm.put("Saurabh", 24);
        hm.put("Katiyar", 25);
        hm.put("John", 21);
        hm.put("Prateek", 20);

        Map<String, Integer> hm1 = new HashMap<>();

        hm1.put("Arjit", 23);
        hm1.put("Saurabh", 24);
        hm1.put("Katiyar", 25);
        hm1.put("John", 21);
        hm1.put("Prateek", 20);

        System.out.println(hm);
        System.out.println();

        System.out.println(hm.equals(hm1)); //equals() 

//        for (Map.Entry m : hm.entrySet() ){
//            System.out.println(m.getKey() +" : "+ m.getValue());
//        }

//        System.out.println(hm.values()); // to get the values.
//        System.out.println(hm.keySet()); // to get the Keys.

        for (String s : hm.keySet()){
            System.out.println(s +" : "+hm.get(s));
        }

        for (Map.Entry map : hm.entrySet()){
            System.out.println(map.getKey() +" : "+ map.getValue());
        }
    }
}
