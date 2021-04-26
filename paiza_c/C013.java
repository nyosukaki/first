import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String hate = sc.next();
        int rooms = sc.nextInt();
        boolean flag = true;
        sc.nextLine();
        
        for(int i = 0; i < rooms; i++){
            String room = sc.nextLine();
            if(!room.contains(hate)){
                 System.out.println(room);
                 flag = false;
            }
        }
        
        if(flag){
            System.out.println("none");
        }
        
    }
}