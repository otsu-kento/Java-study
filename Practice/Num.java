package practice;
public class Num {
    // データ型 整数 少数
    public static void main(String[] args) {
        // byte -100~100
        byte var01 = 1;
        // short -3万~3万
        short var02 = 12345;
        // int -20億~20億 一般的に使われる
        int var03 = 1234567890;
        // long 「京｝の桁以上 最後にLをつける
        long var04 = 123456789000L;

        System.out.println(var01);
        System.out.println(var02);
        System.out.println(var03);
        System.out.println(var04);

        // double 小数点以下の桁数多 小数点を扱うときに一般的に扱われる
        double var05 = 1.23456789;
        // float 小数点以下の桁数少 最後にFをつける
        float var06 = 1.234F;

        System.out.println(var05);
        System.out.println(var06);

        // 定数
        final double PI = 3.14;
        int pie = 5;
        System.out.println("半径" + pie + "cmの半径は、");
        System.out.println(pie * pie * PI);

        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);
    }
}
