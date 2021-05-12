import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = sc.nextInt();
        int point = 1;
        int copy = 0;
        
        for(int i = 0; i < count; i++, point = 0, copy = 0){
            int gram = sc.nextInt();
          while(gram > N * point){
              point++;
              copy = point;
          }
        //   このif文がゼロより小さければ、gramは小さい方の倍数の方が近いことになる
          if(Math.abs(gram - (N * --copy)) - Math.abs(gram - (N * ++copy)) < 0 && point > 1){
              point--;
              System.out.println(N * point);
          }else{
              System.out.println(N * point);
          }
        }
        
        
    }
}