import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        sc.nextLine();
        List<String> list= new ArrayList<String>();
        for(int i = 0; i < people; i++){
            list.add(sc.nextLine());
        }
        
        if(list.contains("rock") && list.contains("scissors") && list.contains("paper")){
            System.out.println("draw");
        }else if(list.contains("rock") && list.contains("scissors")){
            System.out.println("rock");
        }else if(list.contains("rock") && list.contains("paper")){
            System.out.println("paper");
        }else if(list.contains("scissors") && list.contains("paper")){
            System.out.println("scissors");
        }else{
            System.out.println("draw");
        }
        
        
    }
}