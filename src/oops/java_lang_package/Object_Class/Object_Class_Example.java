package oops.java_lang_package.Object_Class;

import java.lang.*;

/*
*   Object class is the parent class for all the classes in Java.
*    1. finalize() => Called by Garbage collector on an object
*                  Which is unreferenced.
*    2. Object class provide destructor as a finalize functions in Java.
*    3. Java allocate a hashcode for every single created object.
* */

class MyObject{
    @Override
    public String toString(){
        return "My Object";
    }

    @Override
    public int hashCode(){
        return 100;
    }

    @Override
    public boolean equals(Object o){
        return this.hashCode() == o.hashCode();
    }
}

public class Object_Class_Example {

    public static void main(String[] args) {
//        Object o1 = new Object();
//        Object o = o1;
//        System.out.println(o == o1);
//        System.out.println(o1);
//
//        Object o2 = new Object();
//        System.out.println(o2);
//        System.out.println(o1 == o2 );
//
//        System.out.println(o1.hashCode());




        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println(o1);
        System.out.println(o2);

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1 == o2); // false
        System.out.println(o1.equals(o2)); // true
    }
}
