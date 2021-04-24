import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String pattern = scan.nextLine();
    String str = scan.nextLine();

    int cnt = 0;
    for (int i = 0; i <= str.length() - pattern.length(); i++) {
        // 今回は2文字づつとっているが、何文字でも汎用的に使える
        String s = str.substring(i, i + pattern.length());
        if (s.equals(pattern)) {
          cnt++;
        }
    }
    System.out.println(cnt);
  }
}