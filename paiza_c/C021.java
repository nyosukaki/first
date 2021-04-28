import java.util.*;
import java.util.ArrayList.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        
        int count = sc.nextInt();
            
        for(int i = 0; i < count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = (int) Math.pow(x - xc, 2) + (int) Math.pow(y - yc, 2);
            
            if(Math.pow(r1, 2) <= result && result <= Math.pow(r2, 2)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        
    }
}