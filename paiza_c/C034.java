import java.util.*;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(" ");
        
        // 強引に場合分けしまくってできた
        if(array[0].equals("x") && array[1].equals("+")){
            System.out.println(Integer.parseInt(array[4]) - Integer.parseInt(array[2]));
        }
        
        if(array[0].equals("x") && array[1].equals("-")){
            System.out.println(Integer.parseInt(array[4]) + Integer.parseInt(array[2]));
        }
        
        if(array[2].equals("x") && array[1].equals("+")){
            System.out.println(Integer.parseInt(array[4]) - Integer.parseInt(array[0]));
        }
        
        if(array[2].equals("x") && array[1].equals("-")){
            System.out.println(Integer.parseInt(array[0]) - Integer.parseInt(array[4]));
        }
        
        if(array[4].equals("x") && array[1].equals("+")){
            System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[2]));
        }
        
        if(array[4].equals("x") && array[1].equals("-")){
            System.out.println(Integer.parseInt(array[0]) - Integer.parseInt(array[2]));
        }
      
      
    }
}