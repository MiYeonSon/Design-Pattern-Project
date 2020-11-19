package drink.soda;

import drink.SodaMachine;

public class NotOrderSodaState implements SodaState{
    SodaMachine sodaMachine;

    public NotOrderSodaState(SodaMachine sodaMachine) { this.sodaMachine = sodaMachine;}

    public void orderSoda() {
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }
    public void payOrder(){
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }
    public void makeSoda(){
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }
    public void giveSoda(){
        System.out.println("아직 주문 전입니다. 주문해주세요.");
    }

    public void refill() {
    }

}
