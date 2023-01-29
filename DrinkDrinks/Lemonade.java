package DrinkDrinks;

public  class Lemonade extends AllDrinks {
    @Override
    public void prepar() {
        System.out.println("Your lemonade is ready");
    }
    static Lemonade lemonade = new Lemonade();
}
