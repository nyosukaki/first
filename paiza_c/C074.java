import java.util.*;


public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int before_size = sc.nextInt();
        int after_size = sc.nextInt();
        String total = "";
        
        for(int i = -1; i < count; i++){
            total = total + sc.nextLine();
        }
        
        
       while(true){
            try{
                String total2 = total.substring(0 , after_size);
                System.out.println(total2);
                total = total.replace(total2, "");
            }
            catch(Exception e){
                System.out.println(total);
                break;
            }
        }
        
    }
}