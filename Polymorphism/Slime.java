package Polymorphism;

public class Slime extends Monster {
    final int LEVEL = 1;
    
    public void run() {
        System.out.println("スライム" + this.suffix + "は体をうねらせて逃げ出した！");
    }
}
