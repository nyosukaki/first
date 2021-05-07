import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variety = sc.nextInt();
        int peoples = sc.nextInt();
        int[] calorie = new int[variety];
        int total = 0;
        
        for(int i = 0; i < variety; i++){
            calorie[i] = sc.nextInt();
        }
        
        for(int i = 0; i < peoples; i++){
            for(int y = 0; y < variety; y++){
                int gram = sc.nextInt();
                // 小数点とintを計算させたら、小数点切り捨てになっていた
                total += calorie[y] * gram  * 0.01;
            }
            System.out.println(total);
            total = 0;
        }
        
        
       
    }
}