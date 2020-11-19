package drink;

import drink.coffee.*;

public class CoffeeMachine {
    public CoffeeState orderCoffeeState;
    public CoffeeState notOrderCoffeeState;
    public CoffeeState soldCoffeeState;
    public CoffeeState soldOutCoffeeState;
    public CoffeeState coffeeState;

    public AmericanoFacade americanoFacade;

    public int beans = 0;
    public int drinkingCoffeeCup = 0;
    public int orderCount;

    public CoffeeMachine(int beans, int drinkingCoffeeCup) {
        orderCoffeeState = new OrderCoffeeState(this);
        notOrderCoffeeState = new NotOrderCoffeeState(this);
        soldCoffeeState = new SoldCoffeeState(this);
        soldOutCoffeeState = new SoldOutCoffeeState(this);

        americanoFacade = new AmericanoFacade(null, new Americano());

        this.beans = beans;
        this.drinkingCoffeeCup = drinkingCoffeeCup;

        if (beans >= 5 && drinkingCoffeeCup >= 1) {
            coffeeState = soldCoffeeState;
        } else {
            coffeeState = soldOutCoffeeState;
        }
    }

    public void orderCoffee() {
        coffeeState.orderCoffee();
    }
    public void payOrder() {
        coffeeState.payOrder();
    }
    public void makeCoffee() {
        coffeeState.makeCoffee();
    }
    public void giveCoffee() {
        coffeeState.giveCoffee();
    }
    public void refill() {
        if (coffeeState == soldOutCoffeeState) {
            soldOutCoffeeState.refill();
        }
    }

    public CoffeeState getOrderCoffeeState() {
        return orderCoffeeState;
    }
    public CoffeeState getNotOrderCoffeeState() {
        return notOrderCoffeeState;
    }
    public CoffeeState getSoldCoffeeState() {
        return soldCoffeeState;
    }
    public CoffeeState getSoldOutCoffeeState() {
        return soldOutCoffeeState;
    }
    public CoffeeState getCoffeeState() {
        return coffeeState;
    }

    public int getBeans() {
        return beans;
    }
    public void setBeans(int beans) {
        this.beans = beans;
    }
    public int getDrinkingCoffeeCup() {
        return drinkingCoffeeCup;
    }
    public void setDrinkingCoffeeCup(int drinkingCoffeeCup) {
        this.drinkingCoffeeCup = drinkingCoffeeCup;
    }
    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}
