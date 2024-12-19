public class Pizza {
    private int price;

    private Boolean veg;

    private int basePizzaPrice;

    private int extraCheesePrice = 2;

    private int extraToppingsPrice = 5;

    private int bagPrice = 1;

    private boolean isExtraCheeseAdded = false;

    private boolean isExtraToppingsAdded = false;

    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 10;
            System.out.println("Veg Pizza");
        }
        else {
            this.price = 15;
            System.out.println("Non-Veg Pizza");
        }
        basePizzaPrice = this.price;
    }

  /*  public void getPizzaPrice(){
        System.out.println(this.price);
    }
   */
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
      /*  System.out.println("Extra Cheese added");
        */
        this.price = this.price + extraCheesePrice;

    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        /*System.out.println("Extra Toppings added");
        */
        this.price += extraToppingsPrice;

    }

    public void takeAway(){
        isOptedForTakeAway = true;
        /* System.out.println("Take Away Order");
        */
        this.price += bagPrice;

    }

    public void getBill(){
        String bill = "";
        System.out.println("Base Pizza Price: "+basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra Cheese Added: "+extraCheesePrice+ "\n";
        }

        if(isExtraToppingsAdded) {
            bill += "Extra Toppings Added: "+extraToppingsPrice+ "\n";
        }

        if(isOptedForTakeAway) {
            bill += "Take Away Bag Charges: "+bagPrice+ "\n";
        }

        bill += "Grand Total: "+this.price + "\n";
        System.out.println(bill);


    }
}
