package oops.Interfaces;

interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void play();
    void pause();
    void stop();
}

class Phone{
    public void call(){
        System.out.println("Phone calling");
    }

    public void sms(){
        System.out.println("Phone SMS");
    }
}

class SmartPhone extends Phone implements Camera, MusicPlayer{
    @Override
    public void call(){
        System.out.println("SmartPhone Calling");
    }

    @Override
    public void sms(){
        System.out.println("SmartPhone SMS");
    }

//    Overriding methods of Camera Interface.

    @Override
    public void click() {
        System.out.println("SmartPhone Camera Click");
    }

    @Override
    public void record() {
        System.out.println("SmartPhone Camera Record");
    }

    //    Overriding methods of MusicPlayer Interface.


    @Override
    public void play() {
        System.out.println("SmartPhone music play");
    }

    @Override
    public void pause() {
        System.out.println("SmartPhone music pause");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone music stop");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        SmartPhone smphone = new SmartPhone();
        smphone.call();

        Camera c = smphone;
        c.click();
        c.record();

        MusicPlayer m = smphone;
        m.play();
        m.pause();
        m.stop();
    }
}
