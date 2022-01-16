package Exercise;

public class Computer extends TangibleAsset {
    String makerName;
    // コンストラクタ
    public Computer(String name, int price, String color, String makerName) {
    super(name, price, color);
    this.makerName = makerName;
    }
    // メソッド
    public String getColor() { return this.color; }
    
    public String getMakerName() { return this.makerName; }
}
