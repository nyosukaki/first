import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int good = 0;
        
        for(int i = 0; i < total; i++){
            String bunri = sc.next();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            int sci = sc.nextInt();
            int lang = sc.nextInt();
            int society = sc.nextInt();
            
            if(eng + math + sci + lang + society >= 350){
                if(bunri.equals("l") && lang + society >= 160){
                    good++;
                }
                
                if(bunri.equals("s") && math + sci >= 160){
                    good++;
                }
            }
        }
        
        System.out.println(good);
        
    }
}