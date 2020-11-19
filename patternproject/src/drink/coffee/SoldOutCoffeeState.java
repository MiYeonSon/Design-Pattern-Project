package drink.coffee;

import drink.CoffeeMachine;

public class SoldOutCoffeeState implements CoffeeState {
    public CoffeeMachine coffeeMachine;

    public SoldOutCoffeeState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }


    public void orderCoffee() {
        System.out.println("주문 불가(사유 : SOLD OUT)\n\n");
    }

    public void payOrder() { System.out.println("결제 불가(사유 : SOLD OUT)"); }

    public void makeCoffee() {
        System.out.println("제조 불가(사유 : SOLD OUT)");
    }

    public void giveCoffee() {
        System.out.println("제공 불가(사유 : SOLD OUT)");
    }

    public void refill() {
        coffeeMachine.setBeans(5000);
        coffeeMachine.setDrinkingCoffeeCup(1000);
        coffeeMachine.coffeeState = coffeeMachine.getSoldCoffeeState();
        System.out.println("\nCoffeeMachine've filled up the stock.");
        System.out.println("[STOCK] DrinkingCoffeeCup : " + coffeeMachine.getDrinkingCoffeeCup() + ", CoffeeBeans : " + coffeeMachine.getBeans());
        System.out.println();
        System.out.println();
    }
}
