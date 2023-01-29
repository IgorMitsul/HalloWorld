package Drinks;

import java.util.Scanner;


import static Drinks.Coffee.coffee;
import static Drinks.Cola.cola;
import static Drinks.Drinks.*;
import static Drinks.Lemonade.lemonade;
import static Drinks.Mojito.mojito;
import static Drinks.Tea.tea;
import static Drinks.Water.water;
 class Choice extends AllDrinks {
    Scanner scan = new Scanner(System.in);
   public static int x = 0;

    void choice() {
        System.out.print("Input pleas what drink do you want : ");
        String drinksChoice = scan.nextLine();

        String drinkChoice = drinksChoice.toUpperCase();
        Drinks drinks = Drinks.valueOf(drinkChoice);
        System.out.println(drinkChoice);
//        boolean pass = (!(drinkChoice.equals(COFFEE)) || (drinkChoice.equals(TEA)) || (drinkChoice.equals(LEMONADE)) ||
//                (drinkChoice.equals(MOJITO)) || (drinkChoice.equals(WATER)) || (drinkChoice.equals(COLA)));

        switch (drinks)  {
            case COFFEE -> {
                coffee.prepar();
                System.out.println(drinkChoice + " costs " + getPriceCoffee() + "$");
                x = x + getPriceCoffee();
            }
            case TEA -> {
                tea.prepar();
                System.out.println(drinkChoice + " costs " + getPriceTea() + "$");
                x = x + getPriceTea();

            }
            case LEMONADE -> {
                lemonade.prepar();
                System.out.println(drinkChoice + " costs " + getPriceLemonade() + "$");
                x = x + getPriceLemonade();

            }
            case MOJITO -> {
                mojito.prepar();
                System.out.println(drinkChoice + " costs " + getPriceMojito() + "$");
                x = x + getPriceMojito();

            }
            case WATER -> {
                water.prepar();
                System.out.println(drinkChoice + " costs " + getPriceWater() + "$");
                x = x + getPriceWater();

            }

            case COLA -> {
                cola.prepar();
                System.out.println(drinkChoice + " costs " + getPriceCola() + "$");
                x = x + getPriceCola();

            }

            default -> {
            }
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
