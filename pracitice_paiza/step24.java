import java.util.*;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Map<String, Integer> zaisan = new HashMap<>();
        
        for(int i = 0; i < count; i++){
            String name = sc.next();
            int money = sc.nextInt();
            
            zaisan.put(name, money);
        }
        
        String keyname = sc.next();
        System.out.print(zaisan.get(keyname));
        
    }
}