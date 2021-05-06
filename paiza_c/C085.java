import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        int[] life = new int[alphabet.length];
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        for(int i = 0; i < alphabet.length; i++){
            life[i] = sc.nextInt();
        }
        
        for(int i = 0; i < alphabet.length; i++){
            hashMap.put(alphabet[i], life[i]);
        }
        
        // sc.nextLineだったらエラーが起きた
        String[] line = sc.next().split("");
        
        for(int i = 0; i < line.length; i++){
           hashMap.put(line[i], hashMap.get(line[i]) - 1);
           if(hashMap.get(line[i]) >= 0){
             System.out.print((line[i]));  
           }
        }
        
        
    }
}