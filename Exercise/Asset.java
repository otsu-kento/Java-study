package exercise;

public abstract class Asset {
    String name;
    int price;
    
    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public abstract String getName();
    
    public abstract int getPrice();
}
