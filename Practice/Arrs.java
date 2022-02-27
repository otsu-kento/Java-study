package practice;
public class Arrs {
    public static void main(String[] args) {
        // 宣言と代入を別々に 2行目のカギカッコの中には要素数を書く
        String[] arr;
        arr = new String[3];

        arr[0] = "sato";
        arr[1] = "suzuki";
        arr[2] = "takahashi";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 宣言と代入を同時に
        int[] arr2 = {11, 22, 33};

        arr2[1] = 44;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // 多次元配列
        // String[][] arr3;
        // arr3 = new String[2][2];

        // arr3[0][0] = "sato";
        // arr3[0][1] = "suzuki";
        // arr3[1][0] = "takahashi";
        // arr3[1][1] = "tanaka";
        
        String[][] arr3 = {{"takahashi", "tanaka"}, {"sasaki", "sato"}};

        System.out.println(arr3[0][0]);
        System.out.println(arr3[0][1]);
        System.out.println(arr3[1][0]);
        System.out.println(arr3[1][1]);
    }
}
