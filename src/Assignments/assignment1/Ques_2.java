package Assignments.assignment1;

class Employee{
    String id;
    String name;
    long salary;

    static String companyName = "Ktech Solutions" ;
    static int empCount = 0;

    public Employee(String name, long salary){
        this.id = assignedUniqueID();
        this.name = name;
        this.salary = salary;
    }

    private String assignedUniqueID(){
        return "EMP_"+ (++empCount);
    }

    public void display(){
        System.out.println("Company name : "+companyName+"\nEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}');
    }

    static void changeCompany(String newCompany){
        companyName = newCompany;
    }

    static int getEmployeeCount(){
        return empCount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}



public class Ques_2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Keshav", 394492L);
        Employee emp2 = new Employee("Mayank", 5000000L);
        Employee emp3 = new Employee("Rudransh", 4893920L);

        System.out.println("\nDetails Before changing the Company name : ");
        System.out.println(emp1);
        Employee.changeCompany("Oracle");
        System.out.println("\nDetails After changing the Company name : ");
        System.out.println(emp1);
    }
}
