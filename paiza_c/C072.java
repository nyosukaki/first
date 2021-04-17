import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int attack = sc.nextInt();
        int defence = sc.nextInt();
        int speed = sc.nextInt();
        int count = sc.nextInt();
        int flag = 0;
        
        for(int i = 0; i < count; i++){
            String bigmonster = sc.next();
            int min_attack = sc.nextInt();
            int max_attack = sc.nextInt();
            int min_defence = sc.nextInt();
            int max_defence = sc.nextInt();
            int min_speed = sc.nextInt();
            int max_speed = sc.nextInt();
            
            
            if(min_attack <= attack && attack <= max_attack && min_defence <= defence && defence <= max_defence && min_speed <= speed && speed <= max_speed){
                System.out.println(bigmonster);
                flag++;
            }
        }
        
        if(flag == 0){
            System.out.println("no evolution");
        }
        
    }
}
