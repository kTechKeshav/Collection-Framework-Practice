package Java8Features.Streams.Questions;

/*
*   Given a list of Strings, join the strings with '[' as prefix, ']' as suffix and ',' as delimiter?
*   {"apple", "mango", "guava"} => [apple],[mango],[guava]
*
*   {"apple", "mango", "guava"} => [apple,mango,guava]
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques_12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "mango", "guava");

        String result = list.stream()
                .map(word -> "[" + word + "]")
                .collect(Collectors.joining(","));

        System.out.println(result);

        String ans = list.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(ans);
    }
}
