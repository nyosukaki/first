import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int paiza_month = sc.nextInt();
        int paiza_day = sc.nextInt();
        int count = 0;
        boolean flag = false;
        
        if(month % 2 == 0){
            count += 15 - day;
            month++;
            day = 1;
        }else{
            count += 13 - day;
            month++;
            day = 1;
        }
        
        Outer:
        while(true){
            if(year % 4 == 1){
                flag = true;
            }
            
            while(true){
                if(month < 14){
                   while(true){
                       if(month % 2 == 0 && day < 16){
                           count++;
                           if(flag && paiza_month == month && paiza_day == day){
                               break Outer;
                           }
                       }else if(month % 2 == 1 && day < 14){
                           count++;
                           if(flag && paiza_month == month && paiza_day == day){
                               break Outer;
                           }
                       }else{
                           day = 1;
                           break;
                       }
                       day++;
                   }
                }else{
                   month = 1;
                   break;
                }
                month++;
            }
            year++;
        }
        
        
        System.out.println(count);
    }
    
}