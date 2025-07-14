package collection_framework.MAP;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        /*
        * --------------------------HashMap-----------------------
        *
        * 1. Unordered
        * 2. Can have one null key and multiple null values
        * 3. Not Synchronized
        * 4. Offers constant time for basic performance like get and put
        * 5. A hash function is an algorithm that takes input
        * and returns a fixed size string of bytes
        *  typically a numerical value the output is
        * known as hash code hash value or simplify hash
        *
        * 6. The primary purpose of hash function is to map data of arbitrary size
        *  to data of fixed size.
        * 7. Deterministic => Same input will produce same output.
        * 8. Regardless of input size, the hash code has a consistent size (32 or 64 bit).
        * 9. Efficient computation.
        *
        * 10. How data is stored in HashMap. [ map.put("Apple", 50) ]
        *  -> Hashing the Key.
        *     Key is passed to Hash Function to generate a unique Hash Code
        *  -> Calculating the Index.
        *     index = HashCode % arraySize.
        *     The index will decide which Bucket will hold the key-value pair
        *  -> Storing in the Bucket.
        *     The key-value pair is stored in the Bucket at the calculated index.
        *     Each Bucket can hold multiple key-value pairs.
        *       (this is called a collision handling mechanism)
        *
        * 11. How HashMap Retrieves the data. [ map.get("Apple") ]
        *  -> Hashing the Key to get the HashCode.
        *  -> The HashCode is used to find the index.
        *  -> Searching in the Bucket the corresponding value for the key.
        *
        * 12. Since different keys can generate the same index (called a collision)
        *     HashMap uses a technique to handle this situation.
        *
        * 13. Java's HashMap uses LinkedList(or balanced tress (Red-Black tress) after Java 8) for this.
        * 14. If multiple key-value pairs map to same bucket, they are stored in a
        *     linked list inside the bucket.
        *
        * 15. When a key value pair is retrieved the HashMap traverses the linked list, checking each
        *     key until it finds a match.
        *
        * 16. HashMap has an Internal array size, which by default is 16.
        * 17. When a number of elements (key value pairs) grows and exceeds a certain
        *     load factor hash map automatically resizes the array to hold more data
        *     this process is called rehashing.
        *
        * 18. The default size of the Array is 16, so when more than 12 elements (16*0.75)
        *     are inserted, the HashMap will resize.
        *
        * 19. The size will increase by double when reach to the Load factor.
        *
        * 20. HashMap provides constant time O(1) performance for basic operations
        *     like put() and get().
        * */


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Keshav");
        map.put(2, "Mayank");
        map.put(3, "Prateek");

        System.out.println(map);
        System.out.println(map.get(2));

        map.put(4, "Ram");
        System.out.println(map);

//        Set<Integer> keys = map.keySet();
//        for(int key : keys){
//            System.out.println(map.get(key));
//        }

//        for(int key : map.keySet()){
//            System.out.println(map.get(key));
//        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey()+ "  " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(4, "RAM");
        map.remove(2);
        System.out.println(map);

        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(2));
    }
}
