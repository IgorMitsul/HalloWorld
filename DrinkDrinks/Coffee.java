package DrinkDrinks;

import Drinks.AllDrinks;

public class Coffee extends AllDrinks {

        @Override
        public  void prepar() {
            System.out.println("Your coffee is ready");
        }
        static Coffee coffee = new Coffee();
}
