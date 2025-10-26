package Java8Features.Streams.PraticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*   Convert each element of the provided list to its square.
* */

public class Ques_12_Convert_to_squares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 7, 2, 9);
        System.out.println(list.stream()
                .map(e->e*e)
                .toList());
    }
}
