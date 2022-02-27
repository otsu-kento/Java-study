package exercise;

public final class Main {
    public static void main(String[] args) {
        Book b1 = new Book("ハリー・ポッター", 1000, "青", "1908734");
        b1.weight = 500.5;
        System.out.println(b1.getName());
        System.out.println(b1.getPrice() + "円");
        System.out.println(b1.getColor());
        System.out.println(b1.getIsbn());
        System.out.println(b1.getWeight());
        b1.setWeight(300.8);
        System.out.println(b1.getWeight());
    }
}
