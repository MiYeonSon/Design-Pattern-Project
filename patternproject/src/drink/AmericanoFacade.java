package drink;

public class AmericanoFacade extends DrinkFacade {
    public AmericanoFacade(Pepsi pepsi, Americano americano) {
        super(pepsi, americano);
    }

    @Override
    public void makeDrink(int num) {
        for(int i = 0; i < num; i++){
            americano.takeCup();
            americano.grind();
            americano.tamping();
            americano.extract();
            americano.pourWater();
            americano.blend();
            americano.pourDrink();

            System.out.println("coffee("+(i+1)+") over.\n");
        }
    }
}
