import java.util.*;


public class Main {
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[2];
        
        for (int i = 0; i < count; i++){
          String doing = sc.next();
        
        //   sc.nextInt();の後には、sc.nextLine();で改行できている。
          if (doing.equals("SET")){
              int num = sc.nextInt() - 1;
              numbers[num] = sc.nextInt();
              sc.nextLine();
               
          }else if(doing.equals("ADD")) {
              int num = sc.nextInt();
              numbers[1] = numbers[0] + num; 
              sc.nextLine();
              
          }else {
              int num = sc.nextInt();
              numbers[1] = numbers[0] - num;
              sc.nextLine();
          }
        }
        System.out.print(numbers[0] + " " + numbers[1]);
    }
}