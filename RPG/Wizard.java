package RPG;

public class Wizard {
    String name;
    int hp;
    
    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(this.name + "が" + h.name + "のHPを10回復した！");
    }
}

