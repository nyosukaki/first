import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // 文字列をsplitで分割して、配列に格納している
    String str[] = scan.nextLine().split("");

    for (String p : str) {
        System.out.println(p);
    }
  }
}