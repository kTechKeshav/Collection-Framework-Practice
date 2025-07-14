package oops.Inheritence;

class Rectangle{
    public int length;
    public int breadth;
    public int x = 10;

    public Rectangle(){
        length = breadth = 1;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle{
    public int height;
    public int x = 20;

    public Cuboid(){
        height = 1;
    }

    public Cuboid(int height){
        this.height = height;
    }

    public Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    public void volume(){
        System.out.println("Volume => "+(length*breadth*height));
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "(From Parent) x=" + super.x +  // Important (Is is used to called the Parent class members)
                ", (From Child) x=" + x +
                '}';
    }
}

public class InheritenceExample3 {
    public static void main(String[] args) {
        Cuboid cub1 = new Cuboid();
        Cuboid cub2 = new Cuboid(2);
        Cuboid cub3 = new Cuboid(1, 2, 3);

        cub1.volume();
        cub2.volume();
        cub3.volume();

        System.out.println(cub1);
    }
}
