package Polymorphism;

public class DeathBat extends Monster {
    final int LEVEL = 15;
    
    public void run() {
        System.out.println("地獄コウモリ" + this.suffix + "は羽ばたいて逃げ出した！");
    }
}
