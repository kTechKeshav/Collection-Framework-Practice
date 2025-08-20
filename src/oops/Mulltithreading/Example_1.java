package oops.Mulltithreading;

// How to give a name to a thread which is extended by Thread class.

class MyThread extends Thread{

    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void run() {
        int count = 1;
        while(true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Example_1 {
    public static void main(String[] args) {
        MyThread t = new MyThread("My thread 1");
        System.out.println(t.getName()); // My thread 1
        System.out.println(t.getId()); // 30
        System.out.println(t.getPriority()); // 5
        System.out.println(t.getState()); // NEW
        System.out.println(t.isAlive());

        t.start();
        t.interrupt();
        System.out.println();
        System.out.println();

        System.out.println(t.getName()); // My thread 1
        System.out.println(t.getId()); // 30
        System.out.println(t.getPriority()); // 5
        System.out.println(t.getState()); // NEW
        System.out.println(t.isAlive());
    }
}
