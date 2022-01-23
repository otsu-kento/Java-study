package RPG;

public final class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("勇者ミナト");
        
        Hero h2 = new Hero();
        
        SuperHero sh = new SuperHero("スーパーヒーロー");
        
        Wizard w = new Wizard();
        w.name = "魔法使いスガワラ";
        w.hp = 50;
        
        Matango m1 = new Matango('A');
        m1.hp = 50;
        
        Matango m2 = new Matango('B');
        m2.hp = 48;
        
        PoisonMatango pm = new PoisonMatango('A');
        pm.hp = 70;
        
        Sword s1 = new Sword();
        s1.name = "炎の剣";
        s1.damage = 10;
        h1.sword = s1;
        
        Sword s2 = new Sword();
        s2.name = "ライトニングソード";
        s2.damage = 15;
        sh.sword = s2;
        
        h1.slip();
        h1.attack(m1);

        m1.attack(h1);

        m2.attack(h2);

        pm.attack(h2);

        h2.sit(15);

        w.heal(h1);
        w.heal(h2);

        h1.run();

        h2.run();

        sh.fly();
        sh.attack(m1);
        sh.land();
        sh.attack(m2);

        m1.run();

        m2.run();
        
        sh.run();
    }
}