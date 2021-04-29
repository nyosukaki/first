import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int width = sc.nextInt();

        // absメソッドで絶対値を取得
        int y = Math.abs(sc.nextInt());
        int x = Math.abs(sc.nextInt());
        
        System.out.println(high * x + width * y - y * x);
        

    }
}