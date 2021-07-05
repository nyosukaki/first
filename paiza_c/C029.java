import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int holiday = sc.nextInt();
        int travel = sc.nextInt();
        List<Integer> day_list = new ArrayList<Integer>();
        List<Integer> weather_list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int weather_count = 0;
        int day_count = 0;
        
        
        for(int i = 0; i < holiday; i++){
            day_list.add(sc.nextInt());
            weather_list.add(sc.nextInt());
        }
        
        for(int i = 0; i < holiday - travel + 1; i++){
            for(int y = 0; y < travel; y++){
                weather_count += weather_list.get(day_count);
                day_count++;
            }
            map.put(day_list.get(i), weather_count);
            day_count -= travel - 1;
            weather_count = 0;
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(list.get(0) == entry.getValue()){
                int go_day = entry.getKey();
                System.out.print(go_day);
                for(int i = 0; i < travel; i++){
                    if(i == travel -1){
                        System.out.print(" " + go_day);
                    }
                    go_day++;
                }
            }
        }
    }
}