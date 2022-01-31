package Polymorphism;

public class Main {
    public static void main(String[] args) {                
        Character[] c = new Character[5];
        
        c[0] = new Hero();
        c[1] = new Thief();
        c[2] = new Wizard();
        
        for (Character ch : c) {
            ch.hp += 50;
        }

        Monster[] monsters = new Monster[4];
        
        monsters[0] = new Slime();
        monsters[1] = new Goblin();
        monsters[2] = new Matango();
        monsters[3] = new DeathBat();
        
        for (Monster m : monsters) {
            m.run();
        }
    }
}
