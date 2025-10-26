package Java8Features.Streams.PraticeQuestions;

/*
*   Find max value from the provided list.
* */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ques_3_Find_Max {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8, 1, 9);

        Optional<Integer> ans = list.stream().max(Integer::compare);
        System.out.println(ans.get());

        // OR

        list.stream()
                .sorted((a, b)->Integer.compare(b, a))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
