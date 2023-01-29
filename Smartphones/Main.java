package Smartphones;

public class Main extends Androids{
    static iPhones iPhonX10 = new iPhones();
    static iPhones iPhon11 = new iPhones();
    static Androids Samsung777 = new Androids();
    static Androids Samsung555 = new Androids();


    public static void main(String[] args) {
        Samsung555.call();
        Samsung777.sms();
        iPhonX10.call();
        iPhon11.sms();
    }
}
