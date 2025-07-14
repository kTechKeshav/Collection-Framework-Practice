package Java8Features.Streams;
import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class StreamApiExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Keshav", 568643),
                new Employee("Alice", 268435),
                new Employee("Bob", 2425452),
                new Employee("Charlie", 223985),
                new Employee("David", 2328452)
        );

        List<String> highEarnerNames = employees.stream()
                .filter(e->e.getSalary()>500000)
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(e->e.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(highEarnerNames);

        double totalSalary = employees.stream()
                .map(Employee :: getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(totalSalary);
    }
}
