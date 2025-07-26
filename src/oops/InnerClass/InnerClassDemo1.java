package oops.InnerClass;

abstract class My{
    abstract void display();
}

class Outer{
    int x = 10;
//  Nested inner-class.
    class Inner{
        int y = 20;
        void innerDisplay(){
            System.out.println(x); // Inner class can access the members of outer class.
            System.out.println(y);
        }
    }

//    Local Inner class. (Inside a method)
    public void methodForLocalInnerClass(){
        class LocalInnerClass{
            void innerInnerDisplay(){
                System.out.println("Hello");
            }
        }

        new LocalInnerClass().innerInnerDisplay();

    }

//    Method for anonymous inner class.
    public void methodForAnonymousInnerClass(){
        My my = new My() {
            @Override
            void display() {
                System.out.println("Hi");
            }
        };

        my.display();
    }

    void outerDisplay(){
//        Outer class methods cannot directly access the members of inner class.
//        We can access the member of Inner class by crating the object of inner class.
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class InnerClassDemo1 {
    /*
    * ---------------Inner Classes----------------------------
    *
    * 1. Class inside a class is called Inner class.
    * 2. There are 4 types of Inner classes.
    *   a) Nested Inner class.
    *   b) Local Inner class.
    *   c) Anonymous inner class.
    *   d) Static inner class.
    * 3. Inner class can access the members of outer class.
    * 4. After compilation of the code the Outer$Inner.class file is generated.
    *
    * */

    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
    }
}
