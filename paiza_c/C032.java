import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int point = 0;
        int cash0 = 0;
        int cash1 = 0;
        int cash2 = 0;
        int cash3 = 0;
        
        for(int i = 0; i < count; i++){
            int item = sc.nextInt();
            int price = sc.nextInt();
            switch(item){
            case 0:
                cash0 += price;
                break;
            case 1:
                cash1 += price;
                break;
            case 2:
                cash2 += price;
                break;
            case 3:
                cash3 += price;
                break;
            }
        }
        
        // 8桁の数字のゼロ埋めを行っている
        String line0 = String.format("%08d", cash0);
        String line1 = String.format("%08d", cash1);
        String line2 = String.format("%08d", cash2);
        String line3 = String.format("%08d", cash3);
            
        // 先頭1~6桁の文字列を取ってきて、それをint型に型変換行っている
        point += Integer.parseInt(line0.substring(0,6)) * 5;
        point += Integer.parseInt(line1.substring(0,6)) * 3;
        point += Integer.parseInt(line2.substring(0,6)) * 2;
        point += Integer.parseInt(line3.substring(0,6)) * 1;
        System.out.println(point);
    }
}