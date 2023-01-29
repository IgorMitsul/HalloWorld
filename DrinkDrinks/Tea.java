package DrinkDrinks;

public class Tea extends AllDrinks {
    @Override
    public void prepar() {
        System.out.println("Your tea is ready");
    }
    static Tea tea = new Tea();
}
