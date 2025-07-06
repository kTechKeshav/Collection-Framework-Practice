package collection_framework.List.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
//        -------------------LinkedList (class) implements List (Interface):----------------------------------------

    /*
     * 1. LinkedList stores its elements as nodes in a doubly linked list.
     * 2. Maintains the order of elements.
     * 3. Can have repeated elements.
     * 4. Index based access of elements.
     * 5. LinkedList doesn't have contiguous memory allocation.
     * 6. lst.add(e) => O(1)
     * 7. lst.remove(index) => O(n)
     * 8. lst.get(index) => O(n)
     */

    public static void main(String[] args) {
//        LinkedList<Integer> lst = new LinkedList<>();
//        lst.add(340);
//        lst.add(346);
//        lst.add(782);
//        lst.add(384);
//        lst.add(485);
//
//        lst.addLast(45);
//        lst.addFirst(100);
//
//        System.out.println(lst.getFirst());
//        System.out.println(lst.getLast());
//
//        System.out.println(lst);
//
////        [100, 340, 346, 782, 384, 485, 45]
////      ⭐⭐⭐
//        lst.removeIf((X)->X%2!=0);
//
//        System.out.println(lst);


        LinkedList<String> animals = new LinkedList<>(List.of("Lion", "Tiger", "Goat", "Rabbit", "wolf"));
        LinkedList<String> petAnimals = new LinkedList<>(Arrays.asList("Rabbit", "Goat"));

        System.out.println(animals);
        System.out.println(petAnimals);
//      ⭐⭐⭐
        animals.removeAll(petAnimals);

        System.out.println(animals);
    }
}