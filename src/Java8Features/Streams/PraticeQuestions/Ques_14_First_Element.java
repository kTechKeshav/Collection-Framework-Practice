package Java8Features.Streams.PraticeQuestions;

/*
*   Write a program to find the first element from the given list.
* */

import java.util.Arrays;
import java.util.List;

public class Ques_14_First_Element {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("APPLE", "BANANA", "APPLE", "ORANGE", "BANANA", "BANANA");

        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
