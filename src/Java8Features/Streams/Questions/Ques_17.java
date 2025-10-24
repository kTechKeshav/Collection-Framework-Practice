package Java8Features.Streams.Questions;

/*
*   Given a list of Integers, find:
*   - The max number
*   - The min number
*   - The sum of all numbers
*   - The average of all numbers
*   - The count of all numbers
* */

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Ques_17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7);

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(n-> n)
                .summaryStatistics();

        System.out.println("Maximum : "+stats.getMax());
        System.out.println("Minimum : "+stats.getMin());
        System.out.println("Sum : "+stats.getSum());
        System.out.println("Average : "+stats.getAverage());
        System.out.println("Count : "+stats.getCount());
    }
}
