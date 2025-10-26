package Java8Features.Streams.PraticeQuestions;

/*
*   Write a program to group string by their length using Java Streams* */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques_4_Group_String_By_Length {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "pear", "grape", "kiwi", "orange");
        Map<Integer, List<String>> ans = list.stream()
                .collect(Collectors.groupingBy(
                        String::length
                ));

        System.out.println(ans);
    }
}
