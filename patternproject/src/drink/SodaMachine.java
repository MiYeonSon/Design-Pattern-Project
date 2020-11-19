package drink;

import drink.soda.*;

public class SodaMachine {
    public SodaState sodaState;
    public SodaState orderSodaState;
    public SodaState notOrderSodaState;
    public SodaState soldSodaState;
    public SodaState soldOutSodaState;

    public PepsiFacade pepsiFacade;

    public int syrups = 0;
    public int drinkingSodaCup = 0;
    public int orderCount;

    public SodaMachine(int syrups, int drinkingSodaCup) {
        orderSodaState = new OrderSodaState(this);
        notOrderSodaState = new NotOrderSodaState(this);
        soldSodaState = new SoldSodaState(this);
        soldOutSodaState = new SoldOutSodaState(this);

        pepsiFacade = new PepsiFacade(new Pepsi(), null);

        this.syrups = syrups;
        this.drinkingSodaCup = drinkingSodaCup;

        if(syrups >= 1 && drinkingSodaCup >= 1){
            sodaState = soldSodaState;
        } else{
            sodaState = soldOutSodaState;
        }
    }

    public void orderSoda(){ sodaState.orderSoda();}
    public void payOrder(){sodaState.payOrder();}
    public void makeSoda(){sodaState.makeSoda();}
    public void giveSoda(){sodaState.giveSoda();}

    public void refill(){
        if(sodaState == soldOutSodaState){
            soldOutSodaState.refill();
        }
    }

    public SodaState getOrderSodaState() {
        return orderSodaState;
    }

    public SodaState getNotOrderSodaState() {
        return notOrderSodaState;
    }

    public SodaState getSoldSodaState() {
        return soldSodaState;
    }

    public SodaState getSoldOutSodaState() {
        return soldOutSodaState;
    }

    public SodaState getSodaState() {
        return sodaState;
    }

    public int getSyrups() {
        return syrups;
    }

    public void setSyrups(int syrups) {
        this.syrups = syrups;
    }

    public int getDrinkingSodaCup() {
        return drinkingSodaCup;
    }

    public void setDrinkingSodaCup(int drinkingSodaCup) {
        this.drinkingSodaCup = drinkingSodaCup;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}
