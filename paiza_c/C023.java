import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        List<Integer> bingo = new ArrayList<Integer>();
        for(int i = 0; i < 6; i++){
            bingo.add(sc.nextInt());
        }
        
        int count = sc.nextInt();
        
        
        for(int i = 0, chance = 0; i < count; i++, chance = 0){
           for(int y = 0; y < 6; y++){
               if(bingo.contains(sc.nextInt())){
                   chance++;
               }
           }
           System.out.println(chance);
        }
        
    }
}