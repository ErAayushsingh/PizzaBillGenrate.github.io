import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice=this.price;
    }

    //    public void getPizzaPrice(){
//        System.out.println(this.price);
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        System.out.println("Extra Toppings Added");
        this.price += extraToppingsPrice;
    }

    public void takeaway() {
        isOptedForTakeAway = true;
        System.out.println("Take away Opted");
        this.price += backPackPrice;
    }

    public void getBill() {
//        System.out.println(this.price);
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Topping Added: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take Away: " + backPackPrice + "\n";
        }
        bill += "Bill: "+this.price + "\n";
        System.out.println(bill);
    }
}