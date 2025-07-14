package collection_framework.MAP.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        /*
        * -------------------LinkedHashMap----------------------
        * Linked HashMap is also not thread safe.
        *
        * 1. It maintains the order of insertion of elements.
        * 2. It is slow in comparison of HashMap.
        * 3. We can give initial capacity and load factor.
        * 4. We can also provide accessOrder (default value = false) while initializing the LinkedHashMap.
        * 5. When access order = true then it follows the concept of LRU (Least recently used technique)
        * 6. The one for which we frequently do lhmap.get(key); will come at the bottom of LinkedHashMap
        * 7. The one which is least used will be at the top of LinkedHashMap.
        * 8.
        * */

        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("Apple", 1);
        hmap.put("Date", 2);
        hmap.put("Pear", 3);
        hmap.put("Guava", 4);

        System.out.println(hmap);

        LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>(10, 0.6f, true);
        lhmap.put("Apple", 1);
        lhmap.put("Date", 2);
        lhmap.put("Pear", 3);
        lhmap.put("Guava", 4);

        System.out.println(lhmap); // {Apple=1, Date=2, Pear=3, Guava=4}

        System.out.println(lhmap.get("Date"));

        System.out.println(lhmap); // {Apple=1, Pear=3, Guava=4, Date=2}


////        ⭐⭐ We can also convert LinkedHashMap to HashMap.
//        HashMap<String, Integer> hmap2 = new HashMap<>(lhmap);
//        System.out.println("Linked HashMap => "+lhmap); // Linked HashMap => {Apple=1, Pear=3, Guava=4, Date=2}
//        System.out.println("HashMap => "+hmap2);  // HashMap => {Guava=4, Apple=1, Pear=3, Date=2}


////        ⭐⭐ We can also convert HashMap to LinkedHashMap.
//        LinkedHashMap<String, Integer> lhmap2 = new LinkedHashMap<>(hmap);
//        System.out.println("HashMap => "+hmap); // HashMap => {Guava=4, Apple=1, Pear=3, Date=2}
//        System.out.println("Linked HashMap => "+ lhmap2); // Linked HashMap => {Guava=4, Apple=1, Pear=3, Date=2}



    }
}
