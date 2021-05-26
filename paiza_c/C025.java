import java.util.*;
 import java.util.ArrayList; 
 import java.util.List;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int have = sc.nextInt();
        int count = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int print = sc.nextInt();
        int carry = 0;
        int total = print;
        List<Integer> list = new ArrayList<Integer>();
        list.add(x);
        
        
        
        for(int i = 1; i < count; i++){
           
           x = sc.nextInt();
           y = sc.nextInt();
           print = sc.nextInt();
           
           if(list.contains(x)){
              total += print;
           }else{
              list.add(x);
              if(total % have == 0){
                 carry += total / have;
              }else{
                 carry += total / have + 1;
              }
              total = print;
           }
        }
        
        if(total % have == 0){
            carry += total / have;
        }else{
            carry += total / have + 1;
        }
        System.out.print(carry);
    }
}