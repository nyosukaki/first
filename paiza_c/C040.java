import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // 値はint型だが、自動的にキャスト変換されている
        double min = 200;
        double max = 100;
        
        for(int i = 0; i < count; i++){
            String hl = sc.next();
            // スキャナーからdoubleの値を取るときは、nextDoubleを使用
            double height = sc.nextDouble();
            sc.nextLine();
            
            if(height < min && hl.equals("le")){
                min = height;
            }
            
            if(height > max && hl.equals("ge")){
                max = height;
            }
        }
        System.out.println(max + " " + min);
    }
}