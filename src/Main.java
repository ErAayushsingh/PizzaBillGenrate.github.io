public class Main {
    public static void main(String[] args) {
       Pizza basePizza = new Pizza(true);
//        basePizza.getPizzaPrice();
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeaway();
//        basePizza.getBill();
        DeluxePizza DP=new DeluxePizza(true);
//        DP.addExtraCheese();
//        DP.addExtraToppings();
        DP.getBill();
    }
}