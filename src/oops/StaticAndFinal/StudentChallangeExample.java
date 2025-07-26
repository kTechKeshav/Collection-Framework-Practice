package oops.StaticAndFinal;

import java.util.Date;

class Student{
    private String rollNo;
    private static int rollNoGenerator;

    static{
        rollNoGenerator=1;
    }

    public Student(){
        rollNo = generateRollNo();
    }

    private String generateRollNo(){
        StringBuilder sb = new StringBuilder();
        sb.append("PSIT-");
        sb.append(new Date().getYear()+1900+"-");
        sb.append(rollNoGenerator);
        rollNoGenerator++;
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                '}';
    }
}

public class StudentChallangeExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
