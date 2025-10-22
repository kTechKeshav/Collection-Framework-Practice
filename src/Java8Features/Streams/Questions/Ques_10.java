package Java8Features.Streams.Questions;
/*
*   Find the nth smallest element in an Array using Java Streams.
*   Find the nth highest element in an Array using Java Streams.
* */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ques_10 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1, 8};
        int n=3;

        Arrays.stream(arr)
                .sorted()
                .skip(n-1)
                .findFirst().ifPresent(System.out::println);

        Arrays.stream(arr)
                .boxed() // Covert primitive to wrapper class.
                .sorted(Collections.reverseOrder())
                .skip(n-1)
                .findFirst().ifPresent(System.out::println);
    }
}
