package Java8Features.LamdaExpressions;

/*
*   ---------------------- Lamda Expression -------------------
*
*   - Lamda expression can be used to override the single method of Functional Interface.
*   - Lamda expression can have their own local variables also and we can use it.
*   - Lamda expression can access local variables (local to the method) only if they are final or effectively final
*       or can't be changed inside the methods.
*   - Through Lamda expression we can able to modify the instance variables that are inside the class.
*   - Instance variables inside class need not to be the final variables.
*   - We can pass Lamda expression as a parameter also.
*
* */

@FunctionalInterface
interface MyLamda{
    public void display();
}

@FunctionalInterface
interface MyLamda2{
    public void display(String str);
}

@FunctionalInterface
interface AddLamda{
    public int add(int a, int b);
}

class My implements MyLamda{
    @Override
    public void display() {
        System.out.println("Hello World 1");
    }
}

class Demo{
    public void callLamda(MyLamda l){
        l.display();
    }
}

public class LamdaDemo {
    public static void main(String[] args) {
        MyLamda m1 = new My();
        m1.display();

        MyLamda m2 = new MyLamda() {
            @Override
            public void display() {
                System.out.println("Hello World 2");
            }
        };
        m2.display();

        // Lamda Expression (Without parameter)
        MyLamda m3 = ()->{
            System.out.println("Hello World 3");
        };
        m3.display();

        // Lamda Expression (With parameter)
        MyLamda2 m4 = (s)->{
            System.out.println(s);
        };
        m4.display("Lamda expression with parameter");

        // Lamda Expression (With parameter without curly braces)
        AddLamda addLamda = (a, b)->a+b;
        System.out.println(addLamda.add(4, 8));


        /// Passing Lamda expression as a parameter.

        Demo obj = new Demo();
        obj.callLamda(()-> System.out.println("Lamda expression passed as parameter"));
    }
}
