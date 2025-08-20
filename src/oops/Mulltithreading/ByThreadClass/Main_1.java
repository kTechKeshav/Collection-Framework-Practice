package oops.Mulltithreading.ByThreadClass;

class Thread1 extends Thread {
    @Override
    public void run(){
        while(true){
            System.out.println("From Thread");
        }
    }
}

public class Main_1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        while(true){
            System.out.println("From Main");
        }
    }
}
