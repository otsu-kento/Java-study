package exercise;

public class Book extends TangibleAsset{
    String isbn;
    // コンストラクタ
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }
    // メソッド
    public String getColor() { return this.color; }
    
    public String getIsbn() { return this.isbn; }
}
