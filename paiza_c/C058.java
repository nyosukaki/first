import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String sample = sc.next();
        String object = sc.next();
        int count = 0;
        
        while(true){
         if(sample.equals(object)){
             break;
         }
           String object2 = object.substring(0,1);
           object = object.substring(1 , size);
           object = object + object2;
           count++;
        }
        
        System.out.println(count);
    }
}