import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int count = sc.nextInt();
        
        for(int i = 0; i < count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 累乗はMathクラスのpowメソッドを使って計算する
            // powメソッドは、第一引数を第二引数で累乗した値を返す
            if(Math.pow(x - a, 2) + Math.pow(y - b, 2) >= Math.pow(r, 2)){
                System.out.println("silent");
            }else{
                System.out.println("noisy");
            }
        }
        
    }
}