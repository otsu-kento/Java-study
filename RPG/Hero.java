package RPG;

public class Hero {
    String name; // 名前の宣言
    int hp; // hpの宣言
    Sword sword;
    
    // コンストラクタ クラス名と同名 voidと戻り値なし
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    
    // コンストラクタのオーバーロード
    public Hero() {
        // 同一クラス内の別コンストラクタ呼び出し
        this("ダミー");
    }
    
    public void attack(Matango m) {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        m.hp -= this.sword.damage;
        System.out.println("敵に" + this.sword.damage + "ポイントのダメージを与えた！");
    }
    
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復したい！");
    }
    
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
