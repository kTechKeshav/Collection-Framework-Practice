package Assignments.assignment1;

class Student{
    String rollNo;
    String name;
    float percentage;

    public Student(String rollNo, String name, float percentage){
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public void displayDetails(){
        System.out.println("\n\nRoll No : "+this.rollNo);
        System.out.println("\nName : "+this.name);
        System.out.println("\nPercentage : "+this.percentage);
    }

    public boolean isPassed(){
        return (this.percentage >= 40);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", isFail='" + (isPassed()?false:true) + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}

public class Ques_1 {
    public static void main(String[] args) {
        Student s1 = new Student("90", "Keshav", 90f);
        Student s2 = new Student("89", "Kavya", 7.78f);
        Student s3 = new Student("102", "Mayank", 99.08f);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
