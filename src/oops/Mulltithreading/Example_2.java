package oops.Mulltithreading;

class MyThread1 extends Thread{
    public MyThread1(String nameOfThread){
        super(nameOfThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Example_2 {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1("Meri Thread");
        t.setDaemon(true);
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        t.start();
    }
}
