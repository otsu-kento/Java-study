package encapsulation;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setHp(100);
        h1.setName("アキラ");

        Wand wa1 = new Wand();
        wa1.setName("ヒイラギの杖");
        wa1.setPower(5.0);

        Wizard w1 = new Wizard();
        w1.setHp(80);
        w1.setMp(50);
        w1.setName("ケイト");
        w1.setWand(wa1);
        w1.heal(h1);
    }
}
