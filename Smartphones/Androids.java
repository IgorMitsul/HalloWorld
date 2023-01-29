package Smartphones;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Your Android calling");

    }

    @Override
    public void sms() {
        System.out.println("You have new SMS in Android");

    }

    @Override
    public void internet() {

    }

    @Override
    public void linOS() {

    }
}
