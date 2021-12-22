package RPG;

public class PoisonMatango extends Matango{
    int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
        this.name = "毒おばけキノコ";
    }
    public void attack(Hero h) {
        super.attack(h);
        if (poisonCount > 0) {
            System.out.println(this.name + this.suffix + "はさらに毒の胞子をばらまいた！");
            int attackDamage = h.hp / 5;
            h.hp -= attackDamage;
            System.out.println(h.name + "は" + attackDamage + "ポイントのダメージ！");
            this.poisonCount--;
        }
    }
}
