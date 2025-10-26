package Java8Features.Streams.PraticeQuestions;

/*
*   Write a program to covert list of Strings to UpperCase.
* */

import java.util.Arrays;
import java.util.List;

public class Ques_2_Convert_to_UpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("keshav", "mango", "mayank");

        System.out.println(list.stream()
                .map(String::toUpperCase)
                .toList());
    }
}
