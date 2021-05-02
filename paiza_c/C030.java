import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int count2 = sc.nextInt();
        
        for(int i = 0; i < count; i++){
            String name = "";
            for(int y = 0; y < count2; y++){
                if(sc.nextInt() >= 128){
                    name += "1 ";
                }else{
                    name += "0 ";
                }
            }
            // ここで余分な空白をtrimメソッドで取り除く
            System.out.println(name.trim());
        }
    }
}