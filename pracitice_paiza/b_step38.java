import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] line = new int[count];
        
        for(int i = 0; i < count; i++){
            line[i] = sc.nextInt();
        }
        
        // ＃昇順にソート
        Arrays.sort(line);
        
        for(int i: line){
            System.out.println(i);
        }
        
    }
}