package DrinkDrinks;

import Drinks.AllDrinks;

public  class Cola extends AllDrinks {
    @Override
    public void prepar() {
        System.out.println("Your cola is ready");
    }
    static Cola cola =new Cola();
}
