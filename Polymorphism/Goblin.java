package Polymorphism;

public class Goblin extends Monster {
    final int LEVEL = 5;
    
    public void run() {
        System.out.println("ゴブリン" + this.suffix + "は腕を振って逃げ出した！");
    }
}
