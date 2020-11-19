package popcorn;

public class PopCornMachine extends PopCorn{
    public PopCornMachine() {
        description = "팝콘";
    }

    public void makePopCorn() {
        System.out.println("...Select a container.");
        System.out.println("...Fry corn.");
        System.out.println("...Put the popcorn in a container.");
    }

    public int cost(){
        return 5000;
    }

}
