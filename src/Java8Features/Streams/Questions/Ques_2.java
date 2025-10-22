package Java8Features.Streams.Questions;

import java.util.Arrays;
import java.util.List;

/*
*   Find all the numbers starting with 1 and are distinct using streams.
*   Find all the numbers that are not starting with 1 and are distinct using streams.
* */

public class Ques_2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(37, 61, 12, 31, 14, 17, 29,17, 91, 14);

        System.out.println("Original => "+numbers); // [37, 61, 12, 31, 14, 17, 29, 17, 91, 14]

        List<Integer> ans1  = numbers.stream()
                .filter(e -> String.valueOf(e).startsWith("1"))
                .distinct()
                .toList();

        System.out.println("Starting with 1 => "+ans1); // [12, 14, 17]

        List<Integer> ans2  = numbers.stream()
                .filter(e -> !String.valueOf(e).startsWith("1"))
                .distinct()
                .toList();

        System.out.println("Not Starting with 1 => "+ans2);// [37, 61, 31, 29, 91]
    }
}
