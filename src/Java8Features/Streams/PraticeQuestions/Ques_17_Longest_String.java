package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.List;

/*
*   Find the length of Longest String using Java Stream API.
* */

public class Ques_17_Longest_String {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("APPLE", "BANANA", "APPLE", "ORANGE", "BANANA", "BANANA");

        System.out.println(list.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0));
    }
}
