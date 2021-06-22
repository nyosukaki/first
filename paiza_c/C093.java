import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String Bob = sc.next();
        String Alice = sc.next();
        int b_score = 0;
        int a_score = 0;
        
        if(Bob.equals("100")){
            b_score = 1;
        }else{
           b_score = Integer.parseInt(Bob.substring(0,1)) + Integer.parseInt(Bob.substring(1,2));
           String b_score1 = String.format("%02d", b_score);
           b_score = Integer.parseInt(b_score1.substring(1,2));
        }
        
        if(Alice.equals("100")){
            a_score = 1;
        }else{
           a_score = Integer.parseInt(Alice.substring(0,1)) + Integer.parseInt(Alice.substring(1,2));
           String a_score1 = String.format("%02d", a_score);
           a_score = Integer.parseInt(a_score1.substring(1,2));
        }
        
        if(b_score > a_score){
            System.out.println("Bob");
        }else if(b_score < a_score){
            System.out.println("Alice");
        }else{
            System.out.println("Draw");
        }
        
    }
}