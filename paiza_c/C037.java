import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String line2 = sc.next();
        int count = 0;
        int time = Integer.parseInt(line2.substring(0,2));
        
        
        while(true){
            if(time >= 24){
                count++;
                time -= 24;
            }else{
                break;
            }
        }
        
        int day = Integer.parseInt(line.substring(3,5)) + count;
        int hour = Integer.parseInt(line2.substring(0,2)) - (count * 24);
        
        line = line.replace(line.substring(3,5), String.format("%02d",day));
        line2 = line2.replace(line2.substring(0,2), String.format("%02d", hour));
        
        System.out.println(line + " " +line2);
    }
}