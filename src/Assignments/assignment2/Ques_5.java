package Assignments.assignment2;

abstract class Shape3D{
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    void calculateSurfaceArea() {
        System.out.println("Surface Area of Sphere => "+(4 * Math.PI * radius * radius));
    }

    @Override
    void calculateVolume() {
        System.out.println("Volume of Sphere => "+(4 * (Math.PI * radius * radius * radius))/3.0);
    }
}

class Cube extends Shape3D{
    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    void calculateSurfaceArea() {
        System.out.println("Surface Area of Cube => "+ (6 * side * side));
    }

    @Override
    void calculateVolume() {
        System.out.println("Volume of Cube => "+ (side * side * side));
    }
}

public class Ques_5 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(4.0);
        Shape3D cube = new Cube(4.0);

        sphere.calculateSurfaceArea();
        sphere.calculateVolume();

        cube.calculateSurfaceArea();
        cube.calculateVolume();
    }
}
