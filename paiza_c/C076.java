import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int regular = sc.nextInt();
        int night = sc.nextInt();
        int midnight = sc.nextInt();
        int workday = sc.nextInt();
        int money = 0;
        Integer[] shifta  = {10,11,12,13,14,15,16,17};
        Integer[] shiftb  = {18,19,20,21,22};
        Integer[] shiftc  = {23,0,1,2,3,4,5,6,7,8,9};
        
        for(int i = 0; i < workday; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            while(start != end){
                if(start < 23){
                    start++;
                }else{
                    start = 0;
                }
                
                if(Arrays.asList(shifta).contains(start)){
                    money += regular;
                }
            
                if(Arrays.asList(shiftb).contains(start)){
                    money += night;
                }
            
                if(Arrays.asList(shiftc).contains(start)){
                    money += midnight;
                }
            }
        }
        System.out.println(money);
    }
}