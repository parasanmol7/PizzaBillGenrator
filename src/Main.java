//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /* Pizza basePizza = new Pizza( false);

       // basePizza.getPizzaPrice();


        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();
        */

        DeluxePizza deluxePizza = new DeluxePizza(true);
        deluxePizza.takeAway();
        deluxePizza.addExtraCheese();
        deluxePizza.getBill();

    }
}