package Assignments.assignment1;

class Shape{
    double length;
    double width;

    public Shape(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        System.out.println("Area => "+(this.length * this.width));
        return 0.0;
    }
}

class Rectangle extends Shape{

    public Rectangle(double length, double breadth){
        super(length, breadth);
    }

    @Override
    public double area() {
        return super.area();
    }

    public void showDetails(){
        System.out.println("\n\nRectangle Length => "+this.length);
        System.out.println("Rectangle Width => "+this.width);
        System.out.println("Area => "+ (this.length * this.width));
    }
}

public class Ques_3 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(34, 55);
        rec.area();
        rec.showDetails();
    }
}
