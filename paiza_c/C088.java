import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] prices = new int[count];
        
        // はじめに格アイテムの値段の情報を配列に詰める
        for(int i = 0; i < count; i++){
            prices[i] = sc.nextInt();
        }
        
        int money = sc.nextInt();
        int items = sc.nextInt();
        
        for(int i = 0; i < items; i++){
            int item = sc.nextInt();
            int total = sc.nextInt();
        // ここで、配列に詰めたアイテムの値段とtotalを掛けている
            if(money >= prices[item - 1] * total){
                money = money - prices[item - 1] * total;
            }
        }
        System.out.println(money);
    }
}