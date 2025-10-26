package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.List;

/*
*   Find the elements that are greater than 10.
* */

public class Ques_16_Greater_than_10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 12, 56, 13, 9, 17, 3, 8, 19);
        System.out.println(list.stream()
                .filter(e->e>10)
                .toList());
    }
}
