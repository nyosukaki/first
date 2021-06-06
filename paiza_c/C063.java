import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int flower = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 1;
        
        for(int i = 0; i < flower; i++){
            int open = sc.nextInt();
            int seed = sc.nextInt();
            int day = open + seed;
            if(map.containsKey(day)){
                map.put(day,map.get(day) + 1);
            }else{
                map.put(day,count);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        List<Integer> list2 = new ArrayList<>();
        
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(list.get(0) == entry.getValue()){
                list2.add(entry.getKey());
            }
		}
		
		Collections.sort(list2);
		System.out.println(list2.get(0));
        
    }
}