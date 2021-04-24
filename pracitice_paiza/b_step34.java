import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        // #try_catch構文を使ったパターン
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] line_array = line.split("");
        try{
            System.out.println(line_array[num - 1] + " " + line_array[num]);
        }catch(Exception e){
            
        }

        // ＃if文を使ったパターン
        int n = scan.nextInt();
        String str[] = scan.next().split("");
    
        if (n < str.length) {
          System.out.println(str[n - 1] + " " + str[n]);
        }

    }
}