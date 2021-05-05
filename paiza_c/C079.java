import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int type = sc.nextInt();
        List<Integer> cards = new ArrayList<Integer>(); 
        List<Integer> gets = new ArrayList<Integer>();
        int plus = 0;
        int total = 0;
        
        for(int i = 0; i < type; i++){
            cards.add(i+1);
        }
        
        for(int i = 0; i < count; i++){
            int card = sc.nextInt();
            if(!gets.contains(card) && cards.contains(card)){
                plus++;
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