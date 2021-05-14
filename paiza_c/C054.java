import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int limit = sc.nextInt();
        int[] time = new int[count];
        int[] distance = new int[count];
        boolean flag = false;
        
        for(int i = 0; i < count; i++){
            time[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }
        
        for(int i = 0; i + 1 < count; i++){
            if((distance[i+1] - distance[i]) / (time[i+1] - time[i]) > limit){
                flag = true;
                break;
            }
        }
        
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}