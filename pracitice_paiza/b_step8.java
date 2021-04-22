import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        // ここで、先にsc.nextLineを書いておかないと空行が出てエラーになる
        sc.nextLine();
        
        for(int i = 0; i < count; i++){
            System.out.println(sc.nextLine());
        }
    }
}