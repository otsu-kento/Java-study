package Exercise;

public abstract class TangibleAsset extends Asset implements Thing{
    String color;
    double weight;
    
    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }
    
    public String getName() { return this.name; }
    
    public int getPrice() { return this.price; }
    
    public abstract String getColor();
    
    public double getWeight() { return this.weight; }
    
    public void setWeight(double weight) {this.weight = weight; }
}
