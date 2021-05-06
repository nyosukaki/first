import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// カードの種類の中で獲得したカードを配列から削除したロジックで進めていたが
// 配列を削除した後に、配列を参照するロジックだとエラーが起きるため
// 獲得したカードを格納するための配列(gets)を別で作ったことが、今回のポイント

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        // カードの枚数
        int count = sc.nextInt();
        // カードの種類
        int type = sc.nextInt();
        // カードの種類を格納するためのList
        List<Integer> cards = new ArrayList<Integer>(); 
        // すでに手に入れたカードを格納するためのList
        List<Integer> gets = new ArrayList<Integer>();
        // 獲得したカードの種類をカウントするための変数
        int plus = 0;
        // カードを確認した回数
        int total = 0;
        
        for(int i = 0; i < type; i++){
            cards.add(i+1);
        }
        
        for(int i = 0; i < count; i++){
            int card = sc.nextInt();
            // まだ獲得していないカード　&&　コンプリートに必要なカードの場合
            if(!gets.contains(card) && cards.contains(card)){
                plus++;
                // 獲得したカードとカードの種類の数が一致したら
                if(plus == type){
                    total++;
                    lucky(total);
                    break;
                }
            };
            gets.add(card);
            total++;
        }
        
        if(plus != type){
            System.out.println("unlucky");
        }
        
    }
    public static void lucky(int total){
        System.out.println(total);
    }
}