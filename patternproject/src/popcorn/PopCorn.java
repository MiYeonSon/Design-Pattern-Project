package popcorn;

public abstract class PopCorn {
    String description = "...";
    public abstract void makePopCorn();
    public abstract int cost();
    public String getDescription(){
        return description;
    }

}
