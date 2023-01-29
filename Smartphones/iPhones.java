package Smartphones;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Your iPhone calling");

    }

    @Override
    public void sms() {
        System.out.println("You have new SMS in iPhone");

    }

    @Override
    public void internet() {

    }

    @Override
    public void ios() {

    }
}
