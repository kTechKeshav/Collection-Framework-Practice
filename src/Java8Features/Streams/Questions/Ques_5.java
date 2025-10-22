package Java8Features.Streams.Questions;

/*
*   Check if a list of Integers contains any prime number or not.
*   Filter out all the Prime Numbers from the given List.
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ques_5 {

    private static boolean checkPrime(int n){
        if(n<=1) return false;

        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(e -> n%e == 0);
    }

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(12, 11, 17, 8, 19, 33, 16);
        boolean ans = lst.stream().anyMatch(Ques_5::checkPrime);
        System.out.println("Does list contains any Prime Number : "+ans);

        List<Integer> primeLst = lst.stream().filter(Ques_5::checkPrime).toList();
        System.out.println("Prime Numbers in the List are : "+ primeLst);
    }
}
