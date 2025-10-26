package Java8Features.Streams.PraticeQuestions;

/*
*   Input:  [
*               [1 2 3],
*               [4 5 6],
*               [7 8 9]
*           ]
*
*   Output:
*           [1, 2, 3, 4, 5, 6, 7, 8, 9]
*
* */

import java.util.Arrays;
import java.util.List;

public class Ques_8_Flatten_List {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 3);
        List<Integer> lst2 = Arrays.asList(4, 5, 6);
        List<Integer> lst3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> list = Arrays.asList(lst1, lst2, lst3);

        List<Integer> flattenList = list.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flattenList);
    }
}
