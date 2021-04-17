import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int total = 0;
        
        for(int i = 0; i < count; i++){
            String day = sc.next();
            int price = sc.nextInt();
            
            if(day.contains("5")){
                total = total + (int)(price * 0.05);
            }else if(day.contains("3")){
                total = total + (int)(price * 0.03);
            }else{
                total = total + (int)(price * 0.01);
            }
        }
        
        System.out.println(total);
    }
}