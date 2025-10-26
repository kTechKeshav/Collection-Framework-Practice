package Java8Features.Streams.PraticeQuestions;

/*
*   Collect odd numbers into a set using the Java Stream API.
* */

import java.util.Arrays;
import java.util.List;

public class Ques_19_Odd_Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 7, 2, 4, 5, 9);
        System.out.println(list.stream()
                .filter(e->e%2!=0)
                .distinct()
                .toList());
    }
}
