package Java8Features.Streams.Questions;
import java.util.Arrays;
import java.util.List;
/*
*   Remove duplicate elements from a list and preserve the order using Java.
* */

public class Ques_1 {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(37, 61, 12, 31, 14, 17, 29,17, 91, 14);
        List<String> lst2 = Arrays.asList("apple", "banana", "apple", "orange", "banana");

//        lst1.stream().distinct().forEach(System.out::println);
        // OR

        List<String> ans = lst2.stream().distinct().toList();
        System.out.println("Original List => "+ lst2); // [apple, banana, apple, orange, banana]
        System.out.println("After Removing Duplicates => "+ans); // [apple, banana, orange]
    }
}
