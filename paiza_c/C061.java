import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = String.format("%03d", sc.nextInt());
        String line2 = String.format("%03d", sc.nextInt());
        
        for(int i = 0; i < 3; i++){
            int line_int = Integer.parseInt(line.substring(i, i+1));
            int line2_int = Integer.parseInt(line2.substring(i, i+1));
            int total = line_int + line2_int;
            
            if(total >= 10){
                String str = String.valueOf(total);
                System.out.print(str.substring(1,2));
            }else if(total < 10 && total > 0){
                String str = String.valueOf(total);
                System.out.print(str);
            }
        }
        
    }
}