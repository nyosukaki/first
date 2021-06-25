import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        int eat_turn = 0;
        int total = 0;
        
        for(int i = 0; i < count; i++){
            
            if("melon".equals(sc.next()) && eat_turn == 0){
                total++;
                eat_turn = 11;
            }
            
            if(eat_turn > 0){
                eat_turn--;
            }
        }
        System.out.println(total);
    }
}