package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
*   Partition the Even and Odd numbers from the provided List using Java Stream API.
*
* */

public class Ques_9_Even_and_Odd_Partition {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 2, 8, 9, 8, 7, 4);
        Map<Boolean, List<Integer>> ans = list.stream()
                .collect(Collectors.partitioningBy(e->e%2==0));

        System.out.println("Odd Numbers : "+ans.get(false));
        System.out.println("Even Numbers : "+ans.get(true));
    }
}
