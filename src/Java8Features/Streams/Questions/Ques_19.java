package Java8Features.Streams.Questions;
import java.util.*;
import java.util.stream.Collectors;

/*
*   Given a list of transactions, find the sum of transaction amounts for each day using Java Streams.
* */

class Transaction{
    private final String date;
    private final double amount;

    public Transaction(String date, double amount){
        this.date = date;
        this.amount = amount;
    }

    public String getDate(){
        return date;
    }

    public double getAmount(){
        return amount;
    }
}

public class Ques_19 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2025-04-20", 100.50),
                new Transaction("2025-04-20", 138.58),
                new Transaction("2025-04-21", 482.50),
                new Transaction("2025-04-21", 481.58),
                new Transaction("2025-04-22", 591.48)
        );

//        Map<String, Double> map = new HashMap<>();

//        for(Transaction t : transactions){
//            map.put(t.getDate(), map.getOrDefault(t.getDate(), 0.0)+t.getAmount());
//        }

//        OR

        Map<String, Double> dailySum = transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getDate,
                        Collectors.summingDouble(Transaction::getAmount)
                ));

        dailySum.forEach((date, sum)-> System.out.println("Date is : "+date+", Amount is : "+sum));
    }
}
