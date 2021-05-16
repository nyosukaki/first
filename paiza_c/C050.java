import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        
        while(true){
            price += 10;
            if(a < price){
                price -= 10;
                System.out.println("B" + " " + price);
                break;
            }
            
            price += 1000;
            if(b < price){
                price -= 1000;
                System.out.println("A" + " " +  price);
                break;
            }
        }
        
    }
}