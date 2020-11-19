package popcorn.decorator;

import popcorn.PopCorn;

public class CaramelDecorator extends ToppingDecorator {
    PopCorn popCorn;

    public CaramelDecorator(PopCorn popCorn) {
        this.popCorn = popCorn;
    }

    public String getDescription(){
        return "Caramel "+ popCorn.getDescription();
    }

    @Override
    public void makePopCorn() {
        System.out.println("...Adding caramel syrup");
    }

    public int cost(){
        return popCorn.cost() + 1000;
    }
}
