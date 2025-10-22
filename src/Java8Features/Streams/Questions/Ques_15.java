package Java8Features.Streams.Questions;

/*
*   Find the words with k vowels in a given sentence.
* */

import java.util.Arrays;
import java.util.List;

public class Ques_15 {
    private static boolean filterLogic(String word, int k){
        for(char ch : word.toCharArray()){
            ch = Character.toUpperCase(ch);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                k--;
            }
        }

        return k==0;
    }

    private static long countVowels(String word){
        return word.chars()
                .mapToObj(ch -> (char)ch)
                .filter(e -> "aeiouAEIOU".indexOf(e)!=-1)
                .count();
    }

    public static void main(String[] args) {
        String sentence = "I have an apple and orange on the table";
        int k = 3;

        String[] words1 = sentence.split(" ");

        Arrays.stream(words1)
                .filter(word -> filterLogic(word, k))
                .forEach(System.out::println);

//      OR

        Arrays.stream(words1)
                .filter(word -> countVowels(word) == k)
                .forEach(System.out::println);



        List<String> words2 = Arrays.asList(sentence.split(" "));
        words2.stream()
                .filter(word -> filterLogic(word, k))
                .forEach(System.out::println);

//        OR

        words2.stream()
                .filter(word -> countVowels(word) == k)
                .forEach(System.out::println);
    }
}
