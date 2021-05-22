import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int window = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(x);
        
        for(int i = 0; i < window; i++){
            x += sc.nextInt();
            y += sc.nextInt();
            list.add(x);
            if(y <= 0){
                break;
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        System.out.println(list.get(0));
    }
}