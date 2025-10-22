package Java8Features.Streams.Questions;

/*
*   Given a list of strings, find out those strings which starts with a number.
* */

import java.util.Arrays;
import java.util.List;

public class Ques_7 {
    public static boolean filterLogic(String s){
        if(s.length() == 0)
            return false;

        char ch = s.charAt(0);
        return (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1apple", "banana", "3Cherry", "date", "guava", "9pear");

        List<String> ans = list.stream()
//                .filter(Ques_7::filterLogic)
                .filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0)))
                .toList();

        System.out.println(ans);
    }
}
