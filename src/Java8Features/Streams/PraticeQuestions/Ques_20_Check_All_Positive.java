package Java8Features.Streams.PraticeQuestions;

/*
*   Check whether all the numbers that are there inside the list are positive or not.
* */

import java.util.Arrays;
import java.util.List;

public class Ques_20_Check_All_Positive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, -8, 1, 2, 5, 6);

        System.out.println(list.stream()
                .allMatch(e->e>0));
    }
}
