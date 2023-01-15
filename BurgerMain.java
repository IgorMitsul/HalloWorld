class Burger {
    int bun, meet, cheese, dressing, lettuce, bacon;
    String Burger, Bun, Meet, Cheese, Dressing, Lettuce, Bacon;


    public void  SimpleBurger(int bun, int meet, int cheese, int lettuce, int dressing) {
        this.bun = bun;
        this.meet = meet;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.dressing = dressing;
        this.Burger = "Simple Burger";
        this.Bun = "Bun";
        this.Meet = "Meet";
        this.Cheese = "Cheese";
        this.Dressing = "Dressing";
        this.Lettuce = "Lettuce";

        System.out.println(Burger + " consist of:\n\t " + Bun + "-" + bun + "pc;  " + Meet + "-" + meet + " gr");
        System.out.println("\t" + Cheese + "-" + cheese + " gr; " + Dressing + "-" + dressing + " gr; " + Lettuce + "-" + lettuce + " gr");

    }

    public void DietBurger(int bun, int meet, int cheese, int lettuce) {
        this.bun = bun;
        this.meet = meet;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.Burger = "DietBurger";
        this.Bun = "Bun";
        this.Meet = "Meet";
        this.Cheese = "Cheese";
        this.Lettuce = "Lettuce";

        System.out.println(Burger + " consist of: \n\t" + Bun + "-" + bun + "pc;  " + Meet + "-" + meet + " gr");
        System.out.println("\t" + Cheese + "-" + cheese + " gr; " + Lettuce + "-" + lettuce + " gr");


    }

    public void DoubleBurger(int bun, int meet, int cheese, int lettuce, int dressing, int bacon) {
        this.bun = bun;
        this.meet = meet;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.dressing = dressing;
        this.bacon = bacon;
        this.Burger = "DoubleBurger";
        this.Bun = "Bun";
        this.Meet = "Meet";
        this.Cheese = "Cheese";
        this.Dressing = "Dressing";
        this.Lettuce = "Lettuce";
        this.Bacon = "Bacon";

        System.out.println(Burger + " consist of: \n\t" + Bun + "-" + bun + "pc;  " + Meet + "-" + meet + " gr; " + Bacon + "-" + bacon + " gr");
        System.out.println("\t" + Cheese + "-" + cheese + " gr; " + Dressing + "-" + dressing + " gr; " + Lettuce + "-" + lettuce + " gr");
    }



}

public class BurgerMain {
    public static void main(String[] args) {
        Burger simpleBurger = new Burger();
        Burger dietBurger = new Burger();
        Burger doubleBurger = new Burger();
        simpleBurger.SimpleBurger(1,100, 30,10,10);
        dietBurger.DietBurger(1, 100, 15, 20);
        doubleBurger.DoubleBurger(1, 200, 30, 10, 10, 10);

    }
}
