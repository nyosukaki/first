import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        String str = sc.next();
        
        for(int i = 0; i < str.length(); i++){
            
           if(str.substring(i,i + 1).equals("/")){
               count++;
           }else if(str.substring(i,i + 1).equals("<")){
               count += 10;
           }
           
        }
        
        System.out.println(count);
        
    }
}