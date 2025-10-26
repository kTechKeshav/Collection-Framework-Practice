package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
*   Remove duplicate elements from the list.
* */

public class Ques_13_Remove_Duplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("APPLE", "BANANA", "APPLE", "ORANGE", "BANANA", "BANANA");

        Set<String> set = new HashSet<>();
        System.out.println(list.stream().filter(e->set.add(e)).toList());

//        OR

        System.out.println(list.stream()
                .distinct()
                .toList());
    }
}
