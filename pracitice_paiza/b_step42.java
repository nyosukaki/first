import java.util.HashMap;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) {
        String array[] = {"HND", "NRT", "KIX", "NGO", "NGO", "NGO", "NGO", "NGO"};
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        
        for (String pattern: array) {
            // countの中にpatternが存在していれば、そのpatternのバリューを＋1して上書き
            // countの中にpatternが存在していなれば、そのpatternのバリューを1にしてputする
            if (count.get(pattern) != null) {
                count.put(pattern, count.get(pattern) + 1);
            } else {
                count.put(pattern, 1);
            }
        }

            // 上のfor文で作成したcount(HashMap)をfor文とentrySetを使って回していく
        for (Entry <String, Integer> element: count.entrySet()) {
            // elementのバリューが1以外の時、バリューを表示するように記載
            if (element.getValue() != 1) {
                System.out.println(element.getValue());
            }
        }
    }
}