package oops.Inheritence;

class Circle{

    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{
    public double height;

    public double volume(){
        return area()*height;
    }
}

public class InheritenceExample1 {
    public static void main(String[] args) {
//        Circle cyl = new Cylinder();
//        cyl.radius = 3.5;
//        cyl.height = 7;  // Now I can't access height.

    }
}
