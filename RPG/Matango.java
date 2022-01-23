package RPG;

public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;
    String name;

    public Matango(char suffix) {
        this.suffix = suffix;
        this.name = "おばけキノコ";
    }

    public void attack(Hero h) {
        System.out.println(this.name + this.suffix + "の攻撃");
        System.out.println(h.name + "に１０のダメージ");
        h.hp -= 10;
    }
    
    public void run() {
        System.out.println(this.name + this.suffix + "は逃げ出した！");
    }
}
