import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] parity = new String[count];
        String[] check ={"","","",""};
        String result = "";
        
        for(int i = 0; i < count; i++){
            parity[i] = sc.nextLine();
        }
        
        for(int i = 0; i < count; i++){
            for(int y = 0; y < 4; y++){
                if(parity[i].substring(y,y+1).equals("1")){
                    check[y] += "1";
                }
            }
        }
        
        for(int i = 0; i < 4; i++){
          if(check[i].length() % 2 == 0){
              result += "0";
          }else{
              result += "1";
          }
        }
        
        System.out.println(result);
        
    }
}