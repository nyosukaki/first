import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int width = sc.nextInt();
        sc.nextLine();
        String strike = "";
        int[] point = new int [high * width];
        int total = 0;
        
        for(int i = 0; i < high ; i++){
            strike += sc.nextLine();
        }
        
        for(int i = 0; i < high * width; i++){
            point[i] = sc.nextInt();
        }
        
        for(int i = 0; i < high * width; i++){
            if(strike.substring(i, i + 1) .equals("o")){
                 total += point[i];
            }
        }
        
        System.out.println(total);
        
        
    }
}