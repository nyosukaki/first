import java.util.*;


public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        
        // sc.hasNextはscの中に取れるものがあればtrueを返し、中身が無くなったらfalseを返す
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}