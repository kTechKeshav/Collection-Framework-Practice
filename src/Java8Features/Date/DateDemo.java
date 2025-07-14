package Java8Features.Date;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());

//        How to calculate the difference between the 2 dates.
        LocalDate start = LocalDate.of(2003, 10, 28);
        LocalDate end = LocalDate.now();

        Period period = Period.between(start, end);

        System.out.println("Years => "+period.getYears());
        System.out.println("Days => "+period.getDays());
        System.out.println("Months => "+period.getMonths());
    }
}
