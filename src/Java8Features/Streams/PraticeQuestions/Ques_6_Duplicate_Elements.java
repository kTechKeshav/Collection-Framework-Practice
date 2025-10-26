package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
*   Write a program in Java to find the duplicate elements in the List.
**/

public class Ques_6_Duplicate_Elements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 7, 8, 6, 3, 4, 5);
        Set<Integer> set = new HashSet<>();

        System.out.println(list.stream()
                .filter(e->!set.add(e))
                .distinct()
                .toList());
    }
}
