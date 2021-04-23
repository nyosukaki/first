import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String string2 = scanner.nextLine();
        String string = scanner.nextLine();

        // substring()メソッドの引数がひとつだった場合、指定した値以降の文字が切り取られる
        System.out.println(string.substring(0, start - 1) + string.substring(start - 1, end).toUpperCase() + string.substring(end));
    }
}