package popcorn.decorator;

import popcorn.PopCorn;

public class OnionDecorator extends ToppingDecorator {
    PopCorn popCorn;

    public OnionDecorator(PopCorn popCorn) {
        this.popCorn = popCorn;
    }

    public String getDescription(){
        return "Onion"+ popCorn.getDescription();
    }

    @Override
    public void makePopCorn() {
        System.out.println("...Adding onion seasoning");
    }

    public int cost(){
        return popCorn.cost() + 700;
    }
}
