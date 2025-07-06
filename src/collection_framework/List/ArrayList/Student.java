package collection_framework.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return (int)(s2.getSgpa()- s1.getSgpa());
    }
}

public class Student {
//    Declare Instant variables.
    private String name;
    private int rollno;
    private int sgpa;

//    Constructors.
    public Student(String name, int rollno, int sgpa){
        this.name = name;
        this.rollno = rollno;
        this.sgpa = sgpa;
    }

//    Getter methods.
    public int getRollno() {
        return rollno;
    }

    public float getSgpa() {
        return sgpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "\n\n Name : "+getName()+"\n Roll No : "+getRollno()+"\n Sgpa : "+getSgpa();
    }
}

class Testing{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Keshav", 90, 7),
                        new Student("Mayank", 102, 8),
                        new Student("Rajat", 78, 7)
                )
        );

        students.sort((s1, s2)->{
            if(s1.getSgpa() == s2.getSgpa()){
                return s2.getName().compareTo(s1.getName());
            }
            return (int)(s1.getSgpa()-s2.getSgpa());
        });

//        students.sort(new StudentComparator());

//        System.out.println(students);
//        ⭐⭐ Below is the way to sort the Students according to the sgpa in Ascending order.

//        Comparator<Student> comparator = Comparator.comparing(Student::getSgpa);
//        students.sort(comparator);


//        ⭐⭐ Below is the way to sort the Students according to the sgpa in Descending order.

//        Comparator<Student> comparator = Comparator.comparing(Student::getSgpa).reversed().thenComparing(Student::getName);
//        students.sort(comparator);

        System.out.println(students);
    }
}
