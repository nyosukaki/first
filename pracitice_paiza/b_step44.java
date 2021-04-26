import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        scanner.nextLine();  // 1行読み飛ばし

        for (int i = 0; i < times; i++) {
            System.out.println(scanner.nextLine().split(" ")[1]);
        }

        scanner.close();
    }
}