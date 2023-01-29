package DrinkDrinks;

import java.util.Arrays;
import java.util.Scanner;

import static DrinkDrinks.Coffee.coffee;
import static DrinkDrinks.Cola.cola;
import static DrinkDrinks.Drinks.*;
import static DrinkDrinks.Lemonade.lemonade;
import static DrinkDrinks.Mojito.mojito;
import static DrinkDrinks.Tea.tea;
import static DrinkDrinks.Water.water;
 class Choice extends AllDrinks {
    Scanner scan = new Scanner(System.in);

   public static int x = 0;




    void choice() {
        System.out.println("Input pleas what drink do you want : \n Coffee - 1 \n Tea - 2 \n Lemonade - 3" +
                " \n Mojito - 4 \n Water - 5 \n Cola - 6");
        int drinkChoice = scan.nextInt();


        Drinks [] drinks =  Drinks.values();

        System.out.println(drinkChoice);


        if (drinkChoice == 1) {
            coffee.prepar();
            System.out.println(drinks [drinkChoice - 1] + " costs " + getPriceCoffee() + "$");
            x = x + getPriceCoffee();
        } else if (drinkChoice == 2) {
            tea.prepar();
            System.out.println(drinks [drinkChoice -1] + " costs " + getPriceTea() + "$");
            x = x + getPriceTea();
        } else if (drinkChoice == 3) {
            lemonade.prepar();
            System.out.println(drinks [drinkChoice - 1] + " costs " + getPriceLemonade() + "$");
            x = x + getPriceLemonade();
        } else if (drinkChoice == 4) {
            mojito.prepar();
            System.out.println(drinks [drinkChoice - 1] + " costs " + getPriceMojito() + "$");
            x = x + getPriceMojito();
        } else if (drinkChoice == 5) {
            water.prepar();
            System.out.println(drinks [drinkChoice - 1] + " costs " + getPriceWater() + "$");
            x = x + getPriceWater();
        } else if (drinkChoice == 6) {
            cola.prepar();
            System.out.println(drinks [drinkChoice - 1] + " costs " + getPriceCola() + "$");
            x = x + getPriceCola();
        }
        else {
            System.out.println("You didn't choose anything");
        }

    }
 }

class Choice2 {
    Scanner scanner = new Scanner(System.in);
    Choice choice = new Choice();
    void choice2() {
        System.out.print("How many drinks do you want? : ");
        int a = scanner.nextInt();
        int i = 0;
        while (i < a) {
            choice.choice();
            i++;
        }
    }



}

public class DrinksApp extends Choice {
    public static void main(String[] args) {

          Choice2 choice2 = new Choice2();
          choice2.choice2();
        System.out.println("Summa your drinks: " + x + " $");

    }
}
