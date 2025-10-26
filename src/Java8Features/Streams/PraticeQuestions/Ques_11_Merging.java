package Java8Features.Streams.PraticeQuestions;

/*
*   Merge 2 lists into a single list using Stream API.
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ques_11_Merging {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 4, 5);
        List<Integer> lst2 = Arrays.asList(4, 7, 8, 9);

        List<Integer> mergedList = Stream.concat(lst1.stream(), lst2.stream()).toList();
        System.out.println(mergedList);
    }
}
