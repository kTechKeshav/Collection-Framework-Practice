package Java8Features.Streams.Questions;

/*
*   Sort the given list of decimals in Reverse Order.
* */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ques_9 {
    public static void main(String[] args) {
        List<Double> decimals= Arrays.asList(3.14, 23.78, 42.13, 26.52, 4.89, 8.79);

        decimals.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
