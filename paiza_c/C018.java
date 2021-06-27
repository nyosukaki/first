import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int must = sc.nextInt();
        Map<String,Integer> must_map = new HashMap<>();
        
        for(int i = 0; i < must; i++){
            must_map.put(sc.next(),sc.nextInt());
        }
        
        int have = sc.nextInt();
        Map<String,Integer> have_map = new HashMap<>();
        
        for(int i = 0; i < have; i++){
            have_map.put(sc.next(), sc.nextInt());
        }
        
        int count = 0;
        
        Outer:
        while(true){
            
            for (Map.Entry<String, Integer> entry : must_map.entrySet()) {
                if(!have_map.containsKey(entry.getKey())){
                    break Outer;
                }
                
            
                try {
                have_map.replace(entry.getKey(),  have_map.get(entry.getKey()) - entry.getValue());
                
                    if(have_map.get(entry.getKey()) < 0){
                    break Outer;
                    }
            
                } catch (Exception e) {
                    break Outer;
                }
            }
            count++;
        }
        System.out.println(count);
        
    }
}