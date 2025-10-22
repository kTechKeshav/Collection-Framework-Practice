package Java8Features.Streams.Questions;

/*
*   Check given String is Palindrome or not using Streams.
* */

import java.util.stream.IntStream;

public class Ques_8 {
    public static void main(String[] args) {
        String input = "adam";

        boolean isPalindrome = IntStream.range(0, input.length())
                .allMatch(i->Character.toUpperCase(input.charAt(i)) == Character.toUpperCase(input.charAt(input.length()-i-1)));

        System.out.println(input + " is : "+ (isPalindrome ? "Palindrome" : "Not Palindrome"));
    }
}
