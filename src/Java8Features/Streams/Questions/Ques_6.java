package Java8Features.Streams.Questions;
import java.util.Arrays;
import java.util.List;

/*
*   How to debug streams using peek()
* */

public class Ques_6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("keshav", "ram", "shiv", "gopal");
        System.out.println("Normal Names : "+names);

        List<String> upperCaseNames = names.stream()
                .peek(e-> System.out.println("Original : "+e))
                .map(String::toUpperCase)
                .peek(e-> System.out.println("After map : "+e))
                .toList();

        System.out.println("After doing operation : "+upperCaseNames);
    }
}
