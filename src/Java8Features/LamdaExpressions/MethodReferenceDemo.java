package Java8Features.LamdaExpressions;

@FunctionalInterface
interface My_Lamda{
    public void show(String str);
}

public class MethodReferenceDemo {

    public MethodReferenceDemo(String s){
        System.out.println(s);
    }

    public static void upper(String str){
        System.out.println(str.toUpperCase());
    }

    public void lower(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        My_Lamda ml1 = System.out::println; // Method Reference through Lamda expression
        ml1.show("Keshav");

        My_Lamda ml2 =  MethodReferenceDemo::upper; // Static Method reference
        ml2.show("Keshav");

        MethodReferenceDemo obj = new MethodReferenceDemo("temp");
        My_Lamda ml3 = obj::lower; // Non-static method reference
        ml3.show("KEsHav");

        My_Lamda ml4 = MethodReferenceDemo::new; // Constructor reference
        ml4.show("Good");
    }
}
