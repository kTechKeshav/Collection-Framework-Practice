package Java8Features.Streams.PraticeQuestions;

/*
*   Check is a list contains any word starting with 'A' or 'a' using Stream Api.
*   Print all words starting with 'A' or 'a' using Stream Api.
* */

import java.util.Arrays;
import java.util.List;

public class Ques_5_Check_Word {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("pear", "grape", "kiwi", "orange", "Apple", "banana", "apricot" );

        System.out.println((list.stream()
                .filter(str-> !str.isEmpty())
                .anyMatch(str-> str.charAt(0) == 'A' || str.charAt(0) == 'a')) ? "Yes it contains": "No it does not contain");

        System.out.println(list.stream()
                .filter(str->!str.isEmpty() && (str.charAt(0) == 'A' || str.charAt(0) == 'a'))
                .toList());

//       OR

        list.stream()
                .filter(str->!str.isEmpty() && (str.startsWith("a") || str.startsWith("A")))
                .forEach(System.out::println);
    }
}
