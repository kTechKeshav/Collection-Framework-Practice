package oops.AccessModifiers.pkg1;

public class Demo1 {
    int w = 10;
    private int x = 7;
    protected int y = 94;
    public int z = 39;

//    Within same class we can access all the access modifiers.
    public void display(){
        System.out.println(w+x+y+z);
    }
}

class  Demo2 extends Demo1{
//    Same pkg with sub class we cannot access private variables x.
    public void func(){
        System.out.println(w+y+z); //
    }
}
