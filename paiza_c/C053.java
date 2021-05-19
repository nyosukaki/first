import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;




public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        sc.nextLine();
        boolean x10 = false;
        String[] cards = new String[players];
        Integer[] intCards = new Integer[players];
        int total = 0;
        
        for(int i = 0; i < players; i++){
            cards[i] = sc.next();
        }

        for(int i = 0; i < players; i++){
            if("x".equals(cards[i].substring(0,1))){
                x10 = true;
                cards[i] = "1";
            }
        }
        
        for(int i = 0; i < players; i++){
            intCards[i] = Integer.parseInt(cards[i]);
        }
        
        if(Arrays.asList(intCards).contains(0)){
            Arrays.sort(intCards, Collections.reverseOrder());
            intCards[0] = 0;
        }
        
        
        for(int i : intCards){
            total += i;
        }
        
        if(x10){
            System.out.println((total - 1) * 10);
        }else{
            System.out.println(total);
        }
        
    }
}