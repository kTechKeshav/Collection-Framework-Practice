package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
*   Write a program in Java to remove NULL values from a List using the Stream API
* */

public class Ques_7_Remove_NULLS {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", null, "Banana", null, "Grapes", "Kiwi", null);

        System.out.println(list.stream()
                .filter(Objects::nonNull)
                .map(String::toLowerCase)
                .toList());
    }
}
