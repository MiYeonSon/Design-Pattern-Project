package drink;

public abstract class DrinkFacade {
    public Pepsi pepsi;
    public Americano americano;

    public DrinkFacade(Pepsi pepsi, Americano americano ){
        this.pepsi = pepsi;
        this.americano = americano;
    }

    public void makePepsi(int num, char size){
        for(int i = 0; i < num; i++){
            pepsi.takeCup();
            pepsi.pourIce();
            pepsi.pourDrink();

            System.out.println("Here's your coke.");

            System.out.println("\n\n\n \n");

        }
    }

    public abstract void makeDrink(int num);
}
