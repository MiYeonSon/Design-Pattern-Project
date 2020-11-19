package popcorn.decorator;

import popcorn.PopCorn;

public class CheeseDecorator extends ToppingDecorator {
    PopCorn popCorn;

    public CheeseDecorator(PopCorn popCorn) {
        this.popCorn = popCorn;
    }

    public String getDescription(){
        return "Cheese "+ popCorn.getDescription();
    }

    @Override
    public void makePopCorn() {
        System.out.println("...Adding  cheese seasoning");
    }

    public int cost(){
        return popCorn.cost() + 700;
    }
}
