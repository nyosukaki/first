import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int parity = 0;
        String numbers = "";
        String check = "";
        
        for(int i = 0; i < count; i++){
            parity += sc.nextInt();
        }
        
        if(parity < 10000){
            numbers = String.format("%04d", parity);
            for(int i = 0; i < 4; i++){
                if(Integer.parseInt(numbers.substring(i, i+1)) % 2 == 0){
                    check += "0";
                }else{
                    check += "1";
                }
            }
        }else{
            numbers = String.format("%05d", parity);
            for(int i = 0; i < 5; i++){
                if(Integer.parseInt(numbers.substring(i, i+1)) % 2 == 0){
                    check += "0";
                }else{
                    check += "1";
                }
            }
        }
        
        System.out.println(check);
        
    }
}