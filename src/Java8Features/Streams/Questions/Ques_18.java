package Java8Features.Streams.Questions;

/*
*   Find the word with 3rd highest length
* */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ques_18 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry", "mango");


        Optional<String > ans = words.stream()
                .distinct()
                .sorted((w1, w2)->Integer.compare(w2.length(), w1.length()))
                .skip(2)
                .findFirst();

        System.out.println(ans.get());

//        OR

        words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(2)
                .findFirst().ifPresent(System.out::println);
    }
}