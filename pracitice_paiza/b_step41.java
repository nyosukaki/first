import java.util.*;

class Main {
    public static void main(String[] args) {
        String array[] = {"HND", "NRT", "KIX", "NGO", "NGO"};

        // flagを初期値falseで置いておいて, 重複が確認できればtrueに変換する
        Boolean result = false;
        
        // 2重ループを使って、配列の見比べを行っている
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                // ここで、「i != j」と条件を書いているのがポイント
                if (i != j && array[i].equals(array[j])) {
                    result = true;
                    break;
                }
            }

            if (result) {
                break;
            }
        }

        System.out.println(result);
    }
}