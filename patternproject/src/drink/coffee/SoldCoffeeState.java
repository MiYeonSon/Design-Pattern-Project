package drink.coffee;

import drink.CoffeeMachine;

import java.util.Scanner;

public class SoldCoffeeState implements CoffeeState {
    CoffeeMachine coffeeMachine;

    public SoldCoffeeState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void orderCoffee() {
        Scanner scannerQ = new Scanner(System.in);
        System.out.print("Please enter the quantity >> ");
        int quantity = scannerQ.nextInt();

        int bean = coffeeMachine.beans - (5 * quantity);
        int cup = coffeeMachine.drinkingCoffeeCup - quantity;

        if (bean < 0 || cup < 0){
            System.out.println("\n죄송합니다. 저희가 가지고 있는 재고(" + coffeeMachine.drinkingCoffeeCup + "개 분량) 보다 많은 주문을 하셔서 주문을 받을 수 없습니다. \n\n");
            return;
        }

        coffeeMachine.setOrderCount(quantity);
        coffeeMachine.coffeeState = coffeeMachine.getOrderCoffeeState();
    }

    public void payOrder(){ }
    public void makeCoffee(){ }
    public void giveCoffee(){ }
    public void refill() { }
}
