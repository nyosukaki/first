import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int team = sc.nextInt();
        int match = team * (team - 1) / 2;
        String[][] league = new String[team][team];
        String line = "";
        
        for(int i = 0; i < match; i++){
            int win = sc.nextInt();
            int lose = sc.nextInt();
            league[win - 1][lose - 1] = "W";
            league[lose - 1][win - 1] = "L";
        }
        
        for(int i = 0; i < team; i++){
            league[i][i] = "-";
        }
        
        for (int i = 0; i < team; i++){
          for (int j = 0; j < team; j++){
            line += league[i][j] + " ";
          }
            System.out.println(line.trim());
            line = "";
        }
        
    }
}