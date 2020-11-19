package drink.coffee;

import drink.CoffeeMachine;

public class NotOrderCoffeeState implements CoffeeState {
    CoffeeMachine coffeeMachine;

    public NotOrderCoffeeState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    public void orderCoffee() {
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }
    public void payOrder(){
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }
    public void makeCoffee(){
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }
    public void giveCoffee(){
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }

    public void refill() {
    }
}
