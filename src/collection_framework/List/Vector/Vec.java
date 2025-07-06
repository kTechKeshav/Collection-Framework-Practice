package collection_framework.List.Vector;

import java.util.Vector;

public class Vec {
    public static void main(String[] args) {
        /*
        * -----------------------Vector--------------------------
        *
        * 1. Vector is Legacy class in Java
        * 2. It is Thread safe and synchronized.
        * 3. It adds performance overhead that's why it is slow.
        * 4. Dynamic Size allocation.
        * 5. Random access based on Indexing.
        * 6. Vector has a method to check capacity => vec.capacity()
        * 7. The capacity of vector increases by double not like 1.5 in ArrayList. (default)
        * 8. We can also give capacity increment with initial capacity also.
        * 9. It maintains the order of elements.
        *
        * */


        Vector<Integer> vec = new Vector<>(12, 3);
        System.out.println(vec);
        System.out.println(vec.capacity());
    }
}
