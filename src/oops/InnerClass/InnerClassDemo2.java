package oops.InnerClass;

class Out{
    int x=10;
    static String s="Example of Static inner class";

    static class My{
        public void show(){
            System.out.println(s); // From a static class we can only access static members.
        }
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
//        Example for static inner class.
        Out.My o=new Out.My();

        o.show();
    }
}
