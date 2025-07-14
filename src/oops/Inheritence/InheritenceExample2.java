package oops.Inheritence;
/*
class Parent{
    public Parent(){
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child class constructor");
    }
}


 */


class Parent{
    public Parent(){
        System.out.println("Non - param of Parent");
    }

    public Parent(int x){
        System.out.println("Param of Parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Non - param of Child");
    }

    public Child(int x){
        System.out.println("Param of Child");
    }

    public Child(int x, int y){
        super(x);
        System.out.println("2 param of child");
    }
}

public class InheritenceExample2   {
    public static void main(String[] args) {
        Child ch1 = new Child(20 , 8 );

        /*

          Note => Constructors are always executed from top to bottom level.

        * Output:
        * Parent class constructor
        * Child class constructor
        *
        * */
    }
}
