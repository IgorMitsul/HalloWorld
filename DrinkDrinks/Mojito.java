package DrinkDrinks;

public  class Mojito extends AllDrinks {
    @Override
    public void prepar() {
        System.out.println("Your mojito is ready");
    }
    static Mojito mojito = new Mojito();
}
