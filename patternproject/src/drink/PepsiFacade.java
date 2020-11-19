package drink;

public class PepsiFacade extends DrinkFacade{
    public PepsiFacade(Pepsi pepsi, Americano americano) {
        super(pepsi, americano);
    }

    @Override
    public void makeDrink(int num) {
        for(int i = 0; i<num; i++){
            pepsi.takeCup();
            pepsi.pourIce();
            pepsi.pourDrink();

            System.out.println("Pepsi("+(i+1)+") over.\n");
        }
    }
}
