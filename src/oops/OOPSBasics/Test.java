package oops.OOPSBasics;

import java.util.ArrayList;
import java.util.Arrays;

class Student{
    private int rollNo;
    private String name;
    private String dept;
    Subject[] subjects;

    public Student(String dept, String name, int rollNo, Subject[] subjects) {
        this.subjects = subjects;
        this.dept = dept;
        this.name = name;
        this.rollNo = rollNo;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}

class Subject {
    private int subId;
    private String subName;
    private int maxMarks;
    private int markObtained;

    public Subject(int subId, String subName, int maxMarks, int markObtained) {
        this.subId = subId;
        this.subName = subName;
        this.maxMarks = maxMarks;
        this.markObtained = markObtained;
    }

    public int getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarkObtained() {
        return markObtained;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "markObtained=" + markObtained +
                ", subName='" + subName + '\'' +
                ", maxMarks=" + maxMarks +
                ", subId=" + subId +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Student std1 = new Student("CS-AI", "Kavya", 89, new Subject[]{
                new Subject(10, "DAA", 100, 80),
                new Subject(58, "DSA", 100, 57),
                new Subject(95, "COA", 100, 60),
        });


        System.out.println(std1);
    }
}
