package collection_framework.List.ArrayList;
import java.util.*;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2){
        return s2.length() - s1.length();
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2){
        return o2-o1;
    }
}

public class Main {
    public static void main(String[] args) {

//        -------------------ArrayList (class) implements List (Interface):----------------------------------------
        /*
        *
        * 1. Maintain order of elements.
        * 2. Can have repeated elements.
        * 3. Index based access of elements.
        * 4. ArrayList is of dynamic size. (default initial capacity = 10)
        * 5. lst.add(e) => O(n)
        * 6. lst.remove(index) => O(n)
        * 7. We can also provide initial capacity with the ArrayList while initialization.
        *       ArrayList<Integer> lst = new ArrayList<>(initialCapacity)
        *       We can use lst.trimToSize() to maintain the capacity = no of elements.
        * 8. Arrays.asList() returns List<> not ArrayList<>
        * 9. List.of() also returns the List<> but the elements of that List can not be modified.
        * 10. lst.toArray() coverts collection to array of objects and returns the array.
        * 11. Collections.sort(lst) => Sorting the elements in ascending order.
        * 12. Collections.sort(lst, Collections.reverseOrder()) => Sorting the elements in descending order.
        * 13. One more way to sort the elements is => lst.sort(null)
        * */

//        ------------------------------------------------------------------------------------------------------

//        How to declare an ArrayList.
        ArrayList<Integer> lst = new ArrayList<>();

//        How to add elements in an ArrayList.
        lst.add(38);
        lst.add(40);
        lst.add(58);
        lst.add(39);
        lst.add(57);

////        How to print the ArrayList.
//        System.out.println(lst);
//
////        How to access the elements from the arraylist based on index.
//        System.out.println(lst.get(2));
//
////        How to get the size of an array list.
//        System.out.println(lst.size());
//
////        Traversing over the ArrayList.
//        for(int i=0; i<lst.size(); i++){
//            System.out.println(lst.get(i));
//        }
//
//        for(int e : lst){
//            System.out.println(e);
//        }
//
////        How to check existence of element in an ArrayList.
//        System.out.println(lst.contains(1));
//        System.out.println(lst.contains(57));

//        System.out.println(lst);  // [38, 40, 58, 39, 57]
//
////      ⭐  How to remove the elements from the list based on the index.
//        System.out.println(lst);  // [38, 40, 58, 39, 57]
//        int num=lst.remove(2); // it also return that value which is removed.
//        System.out.println(num);
//        System.out.println(lst);  // [38, 40, 39, 57]
//
////        ⭐ How to remove the element from the ArrayList based on Value;
//        lst.remove(Integer.valueOf(39)); // Integer.valueOf(39) => Converts normal integer
////        39 to object.
//        System.out.println(lst);

//
////        How to add the element in the list at the provided index and rest of the elements
////        will be swapped accordingly.
//        lst.add(2, 99);
//        System.out.println(lst); // [38, 40, 99, 39, 57]
//
////        How to set the element at the particular index without swapping rest of the elements.
//        lst.set(0, 99);
//        System.out.println(lst); // [99, 40, 99, 39, 57]



//        ----------------------Important------------------------------
//        Arrays.asList() => This can either take elements or collection of elements and
//        returns the List<> as a value.

//        List<String> strLst1= new ArrayList<>(Arrays.asList("Ram", "Keshav")); //✅
//        System.out.println(strLst1);
//
//        String[] strArr = {"Gopal", "Krishna", "Radha"};
//        List<String> strLst2 = new ArrayList<>(Arrays.asList(strArr)); //✅
//        System.out.println(strLst2);
//
//        List<String> strlst3 = Arrays.asList("Ramu", "Shiv"); //✅
//        List<String> strlst4 = Arrays.asList(strArr); //✅

//        But we cannot do like this below because Array.asList() returns List<> not ArrayList<>
//        ArrayList<String> str = Arrays.asList("Priya","Lakhan"); //❌



//        -------------Important--------------------

//        List<Integer> integers = List.of(3, 5, 6, 7);
//        integers.add(45); // ❌ We cannot add or set or modify the content.
//        System.out.println(integers);

//      But we can do like this below.
//        List<Integer> newLst = new ArrayList<>(List.of(3, 5, 6, 7));
//        System.out.println(newLst);
//        newLst.add(88);
//        System.out.println(newLst);


//        ⭐ Good Example.
//        int[] numbers1 = {4, 6, 2, 6, 7};
//        int[] numbers2 = {0, 5, 2, 5, 2};
//        List<int[]> numbers = List.of(numbers1, numbers2); // Returns the List of
////        provided arrays.
//
//        System.out.println(Arrays.toString(numbers.get(0)));
//        System.out.println(Arrays.toString(numbers.get(1)));

//        ⭐⭐ How to add a collection of elements in an existing list.
//        List<Integer> list = new ArrayList<>(Arrays.asList(3, 6, 7, 8));
//        List<Integer> integers = List.of(7, 2, 6);
//
//        list.addAll(integers);
//        System.out.println(list);



//        ⭐⭐⭐⭐⭐How to convert ArrayList to array
//        List<Integer> arr = new ArrayList<>(List.of(3, 5, 6, 7));
//        Integer[] array = arr.toArray(new Integer[0]);
//
//        System.out.println(Arrays.toString(array));

//        --------------Sorting of elements in ArrayList------------
//        System.out.println(lst);
//        Collections.sort(lst);
//        System.out.println(lst);
//        Collections.sort(lst, Collections.reverseOrder());
//        System.out.println(lst);

//        One more way to sort the elements in ascending order
//        System.out.println(lst);
//        lst.sort(null); // ⭐
//        System.out.println("Asc order : "+lst);
//        lst.sort(new MyComparator());
//        System.out.println("Desc order : "+lst);


//        --------------❣️Comparator (Interface to do custom ordering)❣️---------------------
//        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Kiwi");
//        System.out.println(fruits); // [Banana, Apple, Mango]
//        fruits.sort(null);
//        System.out.println(fruits); // [Apple, Banana, Mango]

//        fruits.sort(new StringLengthComparator());
//        fruits.sort((s1, s2)->s1.length()-s2.length()); // Sort the fruits in Descending order based in their length.⭐⭐
//        fruits.sort((s1, s2)->s2.length()-s1.length()); // // Sort the fruits in Ascending order based in their length. ⭐⭐

//        System.out.println(fruits);
    }
}
