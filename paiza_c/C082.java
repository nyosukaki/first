import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int red = sc.nextInt();
        int[][] list = new int[people][3];
        List<Integer> eng = new ArrayList<>();
        List<Integer> lang = new ArrayList<>();
        List<Integer> math = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < people; i++){
            for(int y = 0; y < 3; y++){
                list[i][y] = sc.nextInt();
                switch(y){
                  case 0:
                    eng.add(list[i][y]);
                    break;
                  case 1:
                    lang.add(list[i][y]);
                    break;
                  case 2:
                    math.add(list[i][y]);
                }
            }
        }
        
        Collections.sort(eng);
        Collections.sort(lang);
        Collections.sort(math);
        
        for(int i = 0; i < people; i++){
            for(int y = 0; y < people; y++){
                Inner:
                for(int x = 0; x < red; x++){
                    switch(y){
                        case 0:
                            if(list[i][y] == eng.get(x)){
                                count++;
                                break Inner;
                            };
                            break;
                        case 1:
                            if(list[i][y] == lang.get(x)){
                                count++;
                                break Inner;
                            }
                            break;
                        case 2:
                            if(list[i][y] == math.get(x)){
                                count++;
                                break Inner;
                            }
                    }
                }
            }
            
            System.out.println(count);
            count = 0;
        }
        
    }
}