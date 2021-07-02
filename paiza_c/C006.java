import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int param = sc.nextInt();
        int people = sc.nextInt();
        int rank = sc.nextInt();
        double total = 0.0;
        List<Double> list = new ArrayList<>();
        List<Double> rank_list = new ArrayList<>();

        for(int i = 0; i < param; i++){
            list.add(sc.nextDouble());
        }
        
        for(int i = 0; i < people; i++){
            for(int y = 0; y < param; y++){
                if(y == param - 1){
                     total += list.get(y) * sc.nextInt();
                     total = Math.round(total);
                     rank_list.add(total);
                     total = 0.0;
                }else{
                     total += list.get(y) * sc.nextInt();
                }
            }
        }
        
        Collections.sort(rank_list, Collections.reverseOrder());
        
        for(int i = 0; i < rank; i++){
            System.out.println(rank_list.get(i).intValue());
        }
        
    }
}