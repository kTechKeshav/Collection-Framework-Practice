package Assignments.assignment1;

class Stud{
    private String name;
    private int age;

//    Setter methods are given below.
    public void setName(String name){
        if(name == null || name.equals(""))
            return;

        this.name = name;
    }

    public void setAge(int age){
        if(age>=1 && age <= 120)
            this.age = age;
    }

//    Getter functions are defined below.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Ques_5 {
    public static void main(String[] args) {
        Stud stud1 = new Stud();
        System.out.println(stud1);
        stud1.setAge(34);
        stud1.setName("Keshav");
        System.out.println(stud1);
    }
}
