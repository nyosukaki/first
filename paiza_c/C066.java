import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int poi = sc.nextInt();
        int life = sc.nextInt();
        int[] poi_list = new int[poi];
        int[] w_list = new int[count];
        int poi_num = 0;
        int w_num = 0;
        int get = 0;
        
        for(int i = 0; i < poi; i++){
            poi_list[i] = life;
        }
        
        for(int i = 0; i < count; i++){
            w_list[i] = sc.nextInt();
        }
        
        while(true){
             poi_list[poi_num] -= w_list[w_num];
             if(poi_list[poi_num] > 0){
                 get++;
                 w_num++;
             }else{
                 poi_num++;
             }
             
             if(poi == poi_num || count == w_num){
                 break;
             }
        }
        
        System.out.println(get);
    }
}