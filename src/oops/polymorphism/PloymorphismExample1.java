package oops.polymorphism;


// ⭐⭐ Good example that shows how the return type of the overrided method can be different.
class A{
    public A method1(){
        return new A();
    }
}
class B extends A{
    @Override
    public B method1(){
        return new B();
    }
}

//Method Overriding
class Super{
    public void display(){
        System.out.println("From Super class");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("From Sub class");
    }
}

class Demo{
//    Method Overloading
    public void add(int a , int b){
        System.out.println(a+b);
    }

    public void add(int a , int b, int c){
        System.out.println(a+b+c);
    }
}

public class PloymorphismExample1 {
//    There are mainly 2 types of Polymorphism.
//    1. Compile time polymorphism. (Occurs in Method Overloading) [Among the methods which are having the same name, which will be select will depend on the Compile time.]
//    2. Run time polymorphism.  (Occurs in Method Overriding) (through dynamic method dispatch)
//                                [Among the overrided methods which method will select will be depend at runtime]

    public static void main(String[] args) {
        Demo obj = new Demo();
//        Below will be depend at the compile time.
        obj.add(2, 4, 5);
        obj.add(3, 6);

//        Dynamic method dispatch.
        Super sup1 = new Sub();
        Super sup2 = new Super();
        sup1.display();
        sup2.display();
    }
}
