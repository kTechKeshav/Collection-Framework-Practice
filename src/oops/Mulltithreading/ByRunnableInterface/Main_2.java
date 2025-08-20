package oops.Mulltithreading.ByRunnableInterface;

public class Main_2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("From Thread");
        }
    }

    public static void main(String[] args) {
        Main_2 tt = new Main_2();
        Thread t = new Thread(tt);

        t.start();
        while(true){
            System.out.println("From Main");
        }
    }
}
