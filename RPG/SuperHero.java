package RPG;

public class SuperHero extends Hero {
    boolean flying;
    
    public SuperHero(String name) {
        super(name);
        this.hp = 200;
    }
    
    public void attack(Matango m) {
        super.attack(m);
        if (this.flying) {
            System.out.println("飛び上がっているのでもう一度攻撃できる！");
            super.attack(m);
        }
    }
    
    public void fly() {
        this.flying = true;
        System.out.println(this.name + "は飛び上がった！");
    }
    
    public void land() {
        this.flying = false;
        System.out.println(this.name + "は着地した！");
    }
    
    public void run() {
        System.out.println(this.name + "は撤退した!");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
