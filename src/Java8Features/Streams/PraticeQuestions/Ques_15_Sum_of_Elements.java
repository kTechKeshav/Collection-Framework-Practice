package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Ques_15_Sum_of_Elements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8, 1, 9);

        System.out.println("Sum is : "+list.stream()
                .mapToInt(Integer::intValue)
                .sum());
    }
}
