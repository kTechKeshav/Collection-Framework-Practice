package oops.java_lang_package.Object_Class;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My{
    private int a;
    protected int b;
    public int c;
    int d;

    public My(){}
    public My(int x, int y) {}

    public void display(String s1, String s2){}
    public int show(int x, int y) {return 0;}
}

public class ReflectionDemo {
    public static void main(String[] args) {
        String str = new String("Hello");

        Class c = My.class; // without creating object

        Field fields[] = c.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f);
        }

        System.out.println();

        Constructor cons[] = c.getConstructors();
        for(Constructor con : cons){
            System.out.println(con);
        }

        System.out.println();

        Method methods[] = c.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }

        System.out.println();

        Parameter param[] = methods[1].getParameters();
        for(Parameter parm : param){
            System.out.println(parm);
        }

        // OR Another way
//        My m = new My();

//        Class c1 = m.getClass(); // with creating object

    }
}
