package drink.soda;

import drink.SodaMachine;

import java.util.Scanner;

public class SoldSodaState implements SodaState{
    SodaMachine sodaMachine;

    public SoldSodaState(SodaMachine sodaMachine) { this.sodaMachine = sodaMachine; }

    public void orderSoda() {
        Scanner scannerQ = new Scanner(System.in);
        System.out.print("Please enter the quantity >> ");
        int quantity = scannerQ.nextInt();

        int syrup = sodaMachine.syrups - quantity;
        int cup = sodaMachine.drinkingSodaCup - quantity;

        if (syrup < 0 || cup < 0){
            System.out.println("\n죄송합니다. 저희가 가지고 있는 재고(" + sodaMachine.drinkingSodaCup + "개 분량) 보다 많은 주문을 하셔서 주문을 받을 수 없습니다. \n\n");
            return;
        }

        sodaMachine.setOrderCount(quantity);
        sodaMachine.sodaState = sodaMachine.getOrderSodaState();
    }

    public void payOrder() { }
    public void makeSoda() { }
    public void giveSoda() { }
    public void refill() { }
}
