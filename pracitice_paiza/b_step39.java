import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        scanner.nextLine();  // 1行読み飛ばし

        // キーが数字、バリューが文字列のmapを作成
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        // 数字をソートするための配列を作成
        int index[] = new int[times];

        for (int i = 0; i < times; i++) {
            // 文字と数字が横並びになっている形を文字列として取得後、split関数で割って配列に入れ込む
            String input[] = scanner.nextLine().split(" ");
            // キーが数字、バリューが文字列のmapに先ほどのinputを使って値を代入
            hashMap.put(Integer.parseInt(input[1]), input[0]);
            // 数字だけをint配列に入れ込む
            index[i] = Integer.parseInt(input[1]);
        }

        // int配列を昇順にソート
        Arrays.sort(index);

        // 昇順にソートされた配列をfor文で回して、haspmapの値の中身を取り出す
        for (int i: index) {
            System.out.println(hashMap.get(i));
        }

        scanner.close();
    }
}