package Java8Features.Streams.Questions;

/*
*   Merge 2 sorted lists into a single sorted list using Java Streams.
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ques_4 {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(2, 5, 7, 9);
        List<Integer> lst2 = Arrays.asList(1, 4, 6, 8);

        Stream<Integer> ansStream = Stream.concat(lst1.stream(), lst2.stream()).sorted();
        System.out.println(ansStream.toList());
    }
}
