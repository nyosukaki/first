import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
         line =  line.replaceAll("A", "4");
         line =  line.replaceAll("E", "3");
         line =  line.replaceAll("G", "6");
         line =  line.replaceAll("I", "1");
         line =  line.replaceAll("O", "0");
         line =  line.replaceAll("S", "5");
         line =  line.replaceAll("Z", "2");
        System.out.print(line);
    }   
}