package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
*   Find the second highest element from the List.
* */

public class Ques_18_Second_Highest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 12, 56, 13, 9, 17, 3, 8, 19);

        System.out.println(list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .limit(2)
                .toList().get(1)
        );

//        OR

        list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
