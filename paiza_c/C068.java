import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        char[] line = sc.next().toCharArray();
        
        
        for(int i = 0; i < line.length; i++){
            if(i % 2 == 0){
                int line2 = (int)line[i] - diff;
                if(line2 < 65){
                    int diff2 = 65 - line2;
                    line2 = 91 - diff2;
                }
                System.out.print((char)line2);
            }else{
                int line2 = (int)line[i] + diff;
                if(line2 > 90){
                    int diff2 = line2 -90;
                    line2 = 64 + diff2;
                }
                System.out.print((char)line2);
            }
             
        }
    }
}