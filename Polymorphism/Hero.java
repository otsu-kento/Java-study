package Polymorphism;

public class Hero extends Character {
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージ！");
        m.hp -= 10;
    }
}
