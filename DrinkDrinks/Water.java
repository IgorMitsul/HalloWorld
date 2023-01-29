package DrinkDrinks;

public  class Water extends AllDrinks {
    @Override
    public void prepar() {
        System.out.println("Your water is ready");
    }
    static Water water = new Water();
}
