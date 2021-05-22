import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        int u_speed = sc.nextInt();
        int rest_km = sc.nextInt();
        int rest_time = sc.nextInt();
        int k_speed = sc.nextInt();
        int u_total = 0;
        int k_total = 0;
        
        for(int i = 0; i < km; i++){
            u_total += u_speed;
            k_total += k_speed;
        } 
        
        int rest_count = km /rest_km;
        if(km > rest_count * rest_km){
            u_total += (rest_count) * rest_time;
        }else{
            u_total += (km / rest_km - 1) * rest_time;
        }
       
       
       
        
        if(u_total < k_total){
            System.out.println("USAGI");
        }else if(u_total > k_total){
            System.out.println("KAME");
        }else{
            System.out.println("DRAW");
        }
        
        
        
        
    }
}