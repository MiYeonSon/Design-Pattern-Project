package drink.soda;

import drink.SodaMachine;

public class OrderSodaState implements SodaState {
    SodaMachine sodaMachine;

    public OrderSodaState(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    public void orderSoda(){
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

    public void makeSoda(){
        System.out.println("\n===== In process of manufacture =====");
        sodaMachine.setSyrups(sodaMachine.syrups - sodaMachine.orderCount);
        sodaMachine.setDrinkingSodaCup(sodaMachine.drinkingSodaCup - sodaMachine.orderCount);
        sodaMachine.pepsiFacade.makeDrink(sodaMachine.orderCount);
        sodaMachine.setOrderCount(0);
    }

    public void giveSoda(){
        System.out.println("!!! Here's your order. !!");
        sodaMachine.sodaState = sodaMachine.getNotOrderSodaState();

        if (sodaMachine.getSyrups() == 0 || sodaMachine.getDrinkingSodaCup() == 0){
            sodaMachine.sodaState = sodaMachine.getSoldOutSodaState();
        } else {
            sodaMachine.sodaState = sodaMachine.getSoldSodaState();
        }
    }

    public void refill() {

    }

}
