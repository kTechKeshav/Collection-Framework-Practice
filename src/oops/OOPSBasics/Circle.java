package oops.OOPSBasics;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI*getRadius()*getRadius();
    }

    public double perimeter(){
        return 2*Math.PI*getRadius();
    }

    public double circumference(){
        return perimeter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
