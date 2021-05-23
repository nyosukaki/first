import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        String point = "";
        
        
        for(int i = 0; i < count; i++, point = ""){
            for(int y = 0; y < 3; y++){
                point += String.format("%02d", sc.nextInt());
            }
            list.add(point);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < count; i++){
            Integer gold = Integer.parseInt(list.get(i).substring(0,2));
            Integer silver = Integer.parseInt(list.get(i).substring(2,4));
            Integer bronze = Integer.parseInt(list.get(i).substring(4,6));
            System.out.println(gold + " " + silver + " " + bronze);
        }
        
    }
}