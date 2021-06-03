import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map_reverse = new HashMap<>();
        int people = sc.nextInt();
        
        
        for(int i = 0; i < people; i++){
            map.put(sc.next(), 0);
        }
        
        int count = sc.nextInt();
    
        for(int i = 0; i < count; i++){
            String name = sc.next();
            int money = sc.nextInt();
            int book = map.get(name);
            map.put(name,  book + money);
        }
        
        // キーとバリューを入れ替えた連想配列を生成する
        for(Map.Entry<String, Integer> entry : map.entrySet()){
		    map_reverse.put(entry.getValue(), entry.getKey());
		}
        
        // 連想配列から配列に変換するmap.values
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(map_reverse.get(list.get(i)));
        }
        
    }
}