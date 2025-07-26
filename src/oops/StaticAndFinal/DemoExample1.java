package oops.StaticAndFinal;

class Test{
    static int x=10;
    int y=20;

    void show(){  // Non-static method can access static member of a class.
        System.out.println(x+" "+y);
    }

    static void display(){
        System.out.println(x); // Static method can only access static member of a class.
    }

//    Given below is the Static block.
    static {
        System.out.println("Keshav Awasthi");
        System.out.println(x);
    }
}

public class DemoExample1 {
    /*
    * ---------------------------Static and Final-------------------------------
    *
    * 1. There are mainly 4 things in Static that we will learn in this.
    *  a) Static variables or members
    *     - Static members belongs to a class.
    *     - Static members are shared by all the objects of the class.
    *     - With the help of class object we can access the static members.
    *     - With the help of class name we can access the static members.
    *     - Non-static method can access static member of a class.
    *  b) Static methods
    *     - Static methods belongs to a class.
    *     - They are common for all the objects.
    *     - They can be called just by using class name.
    *     - Static methods can only access static members.
    *  c) Static Nested classes
    *     -  Only the Inner class can be static not the outer classes.
    *  d) Static blocks
    *     - Inside a static block we can only access static methods and static members.
    *     - There can be more than one static block inside a class by the sequence of execution of all
    *           static blocks will be in order.
    *     - Static blocks are automatically executed during the time of object creation.
    *     - If the static blocks are there inside the main class then before execution of main functions
    *       all static blocks are executed sequentially.
    *     - When the static blocks are there inside the other class other than the main class
    *       then that blocks can only be executed when we load that other class inside the main class.
    * */

    public static void main(String[] args) {
        Test t = new Test();

        t.display(); // We can access static methods by object instance.
        Test.display(); // We can access static methods by class also.
    }
}
