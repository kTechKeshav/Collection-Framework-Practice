package Java8Features.Streams.PraticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques_10_Frequency_of_elements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("APPLE", "BANANA", "APPLE", "ORANGE", "BANANA", "BANANA");

        Map<String, Long> freqMap = list.stream()
                .collect(Collectors.groupingBy(
                  e->e, Collectors.counting()
                ));

        System.out.println(freqMap);
    }
}
