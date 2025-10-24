package Java8Features.Streams.Questions;

/*
*   Given an Integer array return True if array contains duplicate elements, return false otherwise.
*
* */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ques_20 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6};
        Set<Integer> numSet = new HashSet<>();

//        boolean ans = Arrays.stream(nums)
//                .anyMatch(ele -> !numSet.add(ele));

//        OR

        boolean hasDuplicate = Arrays.stream(nums)
                        .distinct()
                        .count() != nums.length;

        System.out.println("Array contains duplicate : "+hasDuplicate);
    }
}
