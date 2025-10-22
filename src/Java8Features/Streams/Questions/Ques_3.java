package Java8Features.Streams.Questions;

/*
*   Join 2 Streams
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ques_3 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        Stream<Integer> combinedStream = Stream.concat(list1.stream(), list2.stream());
        combinedStream.forEach(e -> System.out.print(e + " "));
    }
}
