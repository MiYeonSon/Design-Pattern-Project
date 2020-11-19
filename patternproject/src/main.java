import drink.CoffeeMachine;
import drink.SodaMachine;
import popcorn.PopCorn;
import popcorn.PopCornMachine;
import popcorn.decorator.CaramelDecorator;
import popcorn.decorator.CheeseDecorator;
import popcorn.decorator.OnionDecorator;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(5, 1);
        SodaMachine sodaMachine = new SodaMachine(5, 5);

        Outter:
        while (true) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("                   PGV's    SNACK    BAR ");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("> popcorn");
            System.out.println("> soda");
            System.out.println("> coffee");
            System.out.println("> refill");
            System.out.println("> quit");
            System.out.println();
            System.out.print("Choose an order >>> ");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            switch (choice) {
                case "popcorn":
                    int i = 0;
                    PopCorn popCorn = new PopCornMachine();
                    System.out.println("> original");
                    System.out.println("> caramel");
                    System.out.println("> onion");
                    System.out.println("> cheese\n");
                    System.out.print("Choose a type of popcorn >> ");

                    PopCornOutter:
                    while (i <= 2) {
                        String topping = scanner.next();

                        switch (topping) {
                            case "original":
                            case "done":
                                break PopCornOutter;
                            case "caramel":
                                popCorn = new CaramelDecorator(popCorn);
                                i++;
                                break;
                            case "cheese":
                                popCorn = new CheeseDecorator(popCorn);
                                i++;
                                break;
                            case "onion":
                                popCorn = new OnionDecorator(popCorn);
                                i++;
                                break;
                        }

                        System.out.println("> original");
                        System.out.println("> caramel");
                        System.out.println("> onion");
                        System.out.println("> cheese");
                        System.out.println("> done\n");
                        System.out.print("Choose a type of popcorn >> ");
                    }

                    System.out.println("Here's " + popCorn.getDescription());
                    System.out.println(popCorn.cost() + "원");
                    System.out.println();
                    break;

                case "soda":
                    sodaMachine.orderSoda();
                    if (sodaMachine.getSodaState() == sodaMachine.getSoldSodaState()) {
                        break;
                    } else if (sodaMachine.getSodaState() == sodaMachine.getSoldOutSodaState()) {
                        break;
                    }
                    sodaMachine.payOrder();
                    sodaMachine.makeSoda();
                    sodaMachine.giveSoda();
                    break;
                case "coffee":
                    coffeeMachine.orderCoffee();
                    if (coffeeMachine.getCoffeeState() == coffeeMachine.getSoldCoffeeState()) {
                        break;
                    } else if (coffeeMachine.getCoffeeState() == coffeeMachine.getSoldOutCoffeeState()) {
                        break;
                    }
                    coffeeMachine.payOrder();
                    coffeeMachine.makeCoffee();
                    coffeeMachine.giveCoffee();
                    break;
                case "refill":
                    System.out.println("\n> soda");
                    System.out.println("> coffee");
                    System.out.println();
                    System.out.print("Choose an order >>> ");
                    choice = scanner.next();
                    switch (choice) {
                        case "coffee":
                            if (coffeeMachine.getCoffeeState() == coffeeMachine.getSoldOutCoffeeState()) {
                                coffeeMachine.refill();
                            } else {
                                System.out.println("Can't fill the inventory because we still have it in stock.");
                            }
                            break;
                        case "soda":
                            if (sodaMachine.getSodaState() == sodaMachine.getSoldOutSodaState()) {
                                sodaMachine.refill();
                            } else {
                                System.out.println("Can't fill the inventory because we still have it in stock.");
                            }
                            break;
                    }
                    break;
                case "quit":
                    break Outter;
                default:
                    System.out.println("You made the wrong choice. Please select again.");
            }
        }
    }
}
