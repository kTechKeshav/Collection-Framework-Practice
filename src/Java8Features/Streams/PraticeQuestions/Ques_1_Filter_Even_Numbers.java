package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.List;

/*
*   Write a program to filter even numbers from a list
* */

public class Ques_1_Filter_Even_Numbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8, 1, 9);

        System.out.println(list.stream()
                .filter(e->e%2==0)
                .toList());
    }
}
