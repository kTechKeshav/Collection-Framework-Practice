package oops.java_lang_package.Object_Class;

/*
*   1. Java provides wrapper classes so that we can use the functionality of object and classes with that.
*
*   2. Wrapper classes are:
*       Character
*       Byte
*       Short
*       Integer
*       Long
*       Float
*       Double
*       Boolean
*   3. These java classes are present in java.lang package
* */

public class WrapperDemo {

    public static void main(String[] args) {
        int u= 78; // Primitive data type.

//        int n = 5;
//
//        for(int i=1; i<=n; i++){
//            for(int j=n-i; j>=1; j--){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            for(int j=1; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for(int i=n-1; i>=1; i--){
//            for(int j=n-i; j>=1; j--){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            for(int j=1; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        Integer a = Integer.valueOf(10);
        System.out.println(a);

        Integer b  = 11;
        System.out.println(b);

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        System.out.println(c + " " + d); // 15 15

        Byte e = 15;
        Byte f = Byte.valueOf(e);

        System.out.println(e + " " + f); // 15 15

        Character ch = Character.valueOf('A');
        System.out.println(ch);

        float fffff = 3.583f;

        Float ff = Float.valueOf(fffff); // Now ff has non-primitive type of value. (This is boxing a primitive float value)
        float fff = ff.floatValue(); // Now fff contains primitive type of value. (unboxing)

        float ffff = ff; // auto-unboxing

//        Integer.valueOf("binary_string", radix);
        Integer x = Integer.valueOf("10011", 2);
        System.out.println(x); // 19

    }
}
