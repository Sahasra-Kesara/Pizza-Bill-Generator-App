public class Main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.getBill();
    }
}