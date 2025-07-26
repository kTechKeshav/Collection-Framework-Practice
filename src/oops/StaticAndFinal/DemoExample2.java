package oops.StaticAndFinal;

final class Test1{
    public final void show(){
        System.out.println("Hello");
    }
}

public class DemoExample2 {
    /*
    * -------------------------------Final keyword------------------------------------
    *
    * 1. There are 3 main usages of final keyword in Java.
    *       a) final variable
    *           - final variables are written in capital letters.
    *           - We can initialize the final variables either directly or inside instance block or inside constructors.
    *           - We can initialize the static final variables either directly or inside static block or inside constructors.
    *           - Once the value is assigned in final variable it can not be modified further.
    *       b) final method
    *           - final methods can not be overrided.
    *           - We can prevent the run time polymorphism by making the method final.
    *           - It restricts polymorphism.
    *       c) final class
    *           - final class cannot be extended or inherited.
    *           - It restrict inheritance.
    * */

    static final float PI = 3.14f;

    public static void main(String[] args) {
        final int X=10;
        final int Y;
        Y=48;
    }
}
