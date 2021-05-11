import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int point = 0;
        for(int i = 1; i < M; i++){
            for(int y = 1; y < N; y++){
                // Math.powメソッドは、第一引数を第二引数で累乗した値を返す
                // Math.sqrtメソッドは整数の引数の平方根を求める
                // String.valueOfメソッドを使うことでdouble型の値をString型に変換可能
                String judge = String.valueOf(Math.sqrt((int)Math.pow(i, 2) + (int)Math.pow(y, 2)));
                if(judge.length() <= 5){
                    point++;
                }
            }
        }
        System.out.println(point);
    }
}