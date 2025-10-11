package oops.java_lang_package.Object_Class;

import java.util.Arrays;

/*
*   1. Constructor can be private or default in enum.
*   2. With each constant private constructor is associated with it.
*   3. enum will be load during the compile time.
*   4. It can have public methods also.
*
* */

enum Dept{
    CS("John"), IT("Keshav"), CIVIL, ECE("Smith", "Block C"); // predefined finals  // public, final and static

    String name;
    String location;

    private Dept(){ // Private constructor
//        System.out.println(this.name()); // This will print the list of all enums constants

        this.name = "";
        this.location = "";
    }

    private Dept(String name){
//        System.out.println(this.name());

        this.name = name;
        this.location = "";
    }
    private Dept(String name, String loc){
//        System.out.println(this.name());

        this.name = name;
        this.location = loc;
    }

    public void display(){
        System.out.println(this.name() + " " + this.ordinal());
    }

    public String getHeadName(){
        return name;
    }

    public String getLocation(){
        return location;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.CIVIL;
        System.out.println(d);

        // .ordinal() provides the index for finals (0 based ordinals)

        System.out.println(d.ordinal()); // 2

        Dept list[] = Dept.values(); // It will return the list of all enums in the form of array.

        for(Dept e : list){
            System.out.println(e);
        }

        d.display(); // CIVIL 2

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }

}
