package Java8Features.Streams.Questions;

/*
*   Print the last element of the array using Streams.
* */

import java.util.Arrays;
import java.util.Collections;

public class Ques_11 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 5, 7, 3, 9};

        Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .findFirst().ifPresent(System.out::println);

        // OR

        Arrays.stream(arr)
                .skip(arr.length-1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
