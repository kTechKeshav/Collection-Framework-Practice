package oops.AccessModifiers.pkg1;

public class Test {
    public static void main(String[] args) {
//        Now we will try to access from same pkg with non-subclass.
        Demo1 dm1 = new Demo1();
        System.out.println(dm1.w+dm1.y+dm1.z); // Now we cannot access x because it is private.
    }
}
