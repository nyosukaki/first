import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int botan = sc.nextInt();
        int mistake = sc.nextInt();
        int count = sc.nextInt();
        int cursor = 1;
        int point = 0;
        int mistake_count = 0;
        
        for(int i = 0; i < count; i++){
            if(cursor == sc.nextInt()){
                point += 1000;
            }else{
                mistake_count++;
            }
            
            if(cursor == botan){
                cursor = 0;
            }
            
            cursor++;
        }
        
        
        if(mistake_count >= mistake){
            System.out.println(-1);
        }else{
            System.out.println(point);
        }
        
    }
}