package oops.Mulltithreading.ByThreadClass;

public class Main_2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("From Thread");
        }
    }

    public static void main(String[] args) {
        Main_2 t1 = new Main_2();
        t1.start();

        while(true){
            System.out.println("From Main");
        }
    }
}
