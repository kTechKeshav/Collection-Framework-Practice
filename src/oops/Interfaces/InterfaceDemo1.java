package oops.Interfaces;

interface Test{
    void meth1();
    void meth2();
}

interface Demo{
    final static int X=39;
    public abstract void meth1();

    public static void meth3(){
        System.out.println("Meth 3 of demo");
    }
}

class My implements Test, Demo{
    @Override
    public void meth1(){
        System.out.println("This is method1");
    }

    @Override
    public void meth2() {
        System.out.println("This is method 2");
    }

    public void meth3(){
        System.out.println("This is method 3");
    }
}


public class InterfaceDemo1 {
    public static void main(String[] args) {
//        ------------------------------------Interfaces----------------------------
/*
*           1. Interfaces are by default abstract in nature.
*           2. All the methods inside interfaces are by default abstract and public in nature.
*           3. We can not create the object of interfaces.
*           4. We can have the reference of interfaces and an the object of that class
*               which implements that interface.
*           5. Interfaces are implemented not extended.
*           6. When a class implements an interface that class will automatically become abstract until all methods
*               inside interface are not overrided.
*
*           7. Interfaces are used to achieve run time polymorphism. (by Dynamic method dispatch)
*           8. Interfaces are used for defining callback methods. (callback functions mainly used for event handling)
*           9. Methods written inside interfaces cannot be private and final.
*           10. We can also declare identifiers inside interfaces. (like => int X=4) these identifiers are by default static and final.
*           11. We can define whole static method inside interface with body.
*           12. One interface can extends another interface as well.
*           13. interface can have default method as well with body. (The class which implements this interface may or may not override the default method)
*           14. default methods used inside interfaces for not disturbing those classes which implements that interface by introducing new default method inside that interface.
*           15. We can also write private methods inside interface that are not abstract means with body.
*           16. These private methods are used by other default methods inside interface.
* */
        Test t1 = new My();  // Dynamic method dispatch.
        t1.meth1();
        t1.meth2();

        My t2 = new My();
        t2.meth1();
        t2.meth2();
        t2.meth3();

        Demo.meth3();
    }
}
