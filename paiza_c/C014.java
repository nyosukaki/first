import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int line = sc.nextInt() * 2;
        sc.nextLine();
 
        for(int i = 0; i < total; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            if(num1 >= line && num2 >= line && num3 >= line){
            System.out.println(i+1);
            }
        }
    }
}