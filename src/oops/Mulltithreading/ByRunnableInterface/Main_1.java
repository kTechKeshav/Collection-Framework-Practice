package oops.Mulltithreading.ByRunnableInterface;

class Thread1 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("From Thread");
        }
    }
}

public class Main_1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();

        Thread t = new Thread(t1);
        t.start();

        while(true){
            System.out.println("From main");
        }
    }
}

