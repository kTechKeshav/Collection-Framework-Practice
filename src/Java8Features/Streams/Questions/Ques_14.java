package Java8Features.Streams.Questions;

/*
*   Find the sum of unique numbers in a given list.
* */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ques_14 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(3, 5, 6, 7, 8, 2, 3, 9, 1);

        System.out.println("Original : "+lst);

        List<Integer> dist = lst.stream()
                .distinct()
                .toList();

        System.out.println("Distinct : "+ dist);

        int ans = lst.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum is : "+ans);

//        OR

        Optional<Integer> result = lst.stream()
                .distinct()
                .reduce((a, b)->a+b);

        result.ifPresent(System.out::println);

    }
}
