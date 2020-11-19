package drink.coffee;

import drink.CoffeeMachine;

public class OrderCoffeeState implements CoffeeState {
    CoffeeMachine coffeeMachine;


    public OrderCoffeeState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void orderCoffee() {
        System.out.println("이미 주문 하셨습니다.");
    }

    public void payOrder() {
        System.out.println("\nPayment in progress...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("error");
        }
        System.out.println("Payment completed!!");
    }

    public void makeCoffee() {
        System.out.println("\n===== In process of manufacture =====");
        coffeeMachine.setBeans(coffeeMachine.beans - coffeeMachine.orderCount * 5);
        coffeeMachine.setDrinkingCoffeeCup(coffeeMachine.drinkingCoffeeCup - coffeeMachine.orderCount);
        coffeeMachine.americanoFacade.makeDrink(coffeeMachine.orderCount);
        coffeeMachine.setOrderCount(0);
    }

    public void giveCoffee() {
        System.out.println("!!! Here's your order. !!");
        coffeeMachine.coffeeState = coffeeMachine.getNotOrderCoffeeState();

        if (coffeeMachine.getBeans() == 0 || coffeeMachine.getDrinkingCoffeeCup() == 0){
            coffeeMachine.coffeeState = coffeeMachine.getSoldOutCoffeeState();
        } else {
            coffeeMachine.coffeeState = coffeeMachine.getSoldCoffeeState();
        }
    }

    public void refill() { }

}
