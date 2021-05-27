import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a_count = sc.nextInt();
        int b_count = sc.nextInt();
        sc.nextLine();
        int num = 0;
        
        String light = sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        for(int i = 0; i < count; i++){
            if(light.substring(i, i + 1).equals(a.substring(num, num + 1))){
               a_count--;
               num++;
            }
            
            if(a_count == 0){
                break;
            }
        }
        
        num = 0;
        
         for(int i = 0; i < count; i++){
            if(light.substring(i, i + 1).equals(b.substring(num, num + 1))){
               b_count--;
               num++;
            }
            
            if(b_count == 0){
                break;
            }
        }
        
        System.out.println(a_count + " " +b_count);
    }
}