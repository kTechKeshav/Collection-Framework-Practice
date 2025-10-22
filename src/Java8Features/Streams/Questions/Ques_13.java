package Java8Features.Streams.Questions;

/*
*   Find the sum of the first 2 numbers in a given list
* */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ques_13 {
    public static void main(String[] args) {
        int[] arr = {14, 5, 6, 7, 3 , 2};

        Integer totalSum = Arrays.stream(arr)
                .sum();

        Integer sumExceptFirstTwo = Arrays.stream(arr)
                .skip(2)
                .sum();

        System.out.println(totalSum-sumExceptFirstTwo);

//        OR

        int result = Arrays.stream(arr)
                .limit(2 )
                .sum();
        
        System.out.println(result);

        List<Integer> lst = Arrays.asList(23, 56, 78);

        Optional<Integer> ans = lst.stream()
                .limit(2)
                .reduce((a, b)-> a+b);

        ans.ifPresent(System.out::println);
    }
}
