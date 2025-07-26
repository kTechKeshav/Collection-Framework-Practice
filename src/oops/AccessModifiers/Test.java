package oops.AccessModifiers;

import oops.AccessModifiers.pkg1.Demo1;

public class Test {
    /*--------------------Access Modifiers---------------
     *
     * 1. There are 4 types of access modifiers.
     *   a) default   ->   (only accessible within the same package)
     *   b) private   ->   (only accessible within the same class)
     *   c) protected ->  (accessible in same package and also in different package that has subclass)
     *   d) public    ->   (accessible everywhere)
     *
     * 2. We can use access modifiers with members, methods and classes.
     * 3. Outer class can be only default or public not (private or protected).
     * */

    class Q1 extends Demo1{
        public void method2(){
//            Now we will try to access the members of class Demo1 from subclass of different pkg.
            System.out.println(y+z); // we cannot access w and x because they are default and private.
        }
    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.display(); // All variables are accessible within the same class.

//        Now we will try to access the members of class Demo1 from non-subclass of different pkg.
        System.out.println(d1.z); // Only z will be accessible because  it is public.
    }
}
