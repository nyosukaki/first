import java.util.*;


public class Main {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int count = sc.nextInt();
     String keyword = sc.next();
     int none = 0;
     
     for(int i = 0; i < count; i++){
         String str = sc.next();
         int result = str.indexOf(keyword);
         if(result != -1){
             System.out.println(str);
         }else{
             none++;
         }
     }
     
     if(count == none){
         System.out.println("None");
     }
    
    }
    
    
}