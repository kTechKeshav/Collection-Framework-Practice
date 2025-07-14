package oops.Inheritence;

// Method Overriding

class Super{
    public void method1(){
        System.out.println("This is method 1");
    }
    public void display(){
        System.out.println("Hello");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Welcome");
    }

    public void method3(){
        System.out.println("This is method 3");
    }
}

public class InheritenceExample4 {
    public static void main(String[] args) {
//        Dynamic Method Dispatch (⭐⭐It is used for achieving run time polymorphism)
        /*
        * A super class reference holding an object of subclass then when calling
        * the override method then the method called will be based on object
        * not on reference.
        *
        * */
        Super obj1 = new Super();
        obj1.display();

        Super obj2 = new Sub();
        obj2.display();

        Sub obj3 = new Sub();

//        Note : A subclass reference cannot hold the object of superclass.
//        Sub obj = new Super();  ❌❌❌

        obj1.method1();  // This is method 1
        obj1.display();  // Hello

        obj2.display();  // Welcome
        obj2.method1(); // This is method 1

        obj3.method3(); // This is method 3

    }
}
