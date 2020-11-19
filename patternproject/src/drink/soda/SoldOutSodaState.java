package drink.soda;

import drink.SodaMachine;

public class SoldOutSodaState implements SodaState {
    public SodaMachine sodaMachine;

    public SoldOutSodaState(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    public void orderSoda() {
        System.out.println("주문 불가(사유 : SOLD OUT)\n\n");
    }
    public void payOrder() { System.out.println("결제 불가(사유 : SOLD OUT)"); }
    public void makeSoda() { System.out.println("제조 불가(사유 : SOLD OUT)"); }
    public void giveSoda() { System.out.println("제공 불가(사유 : SOLD OUT)"); }

    public void refill() {
        sodaMachine.setSyrups(1000);
        sodaMachine.setDrinkingSodaCup(1000);
        sodaMachine.sodaState = sodaMachine.getSoldSodaState();
        System.out.println("\nCoffeeMachine've filled up the stock.");
        System.out.println("[STOCK] DrinkingSodaCup : " + sodaMachine.getDrinkingSodaCup() + ", Syrups : " + sodaMachine.getSyrups());
        System.out.println();
        System.out.println();
    }
}
