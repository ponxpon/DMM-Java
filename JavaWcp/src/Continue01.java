// 8章【繰り返しを学ぼう】

public class Continue01 {
	public static void main(String[] args) {
        for (int count = 0; count < 5; count++) {
            if (count == 2) {
            	// continue文とは、ループ処理の途中でその後の処理をスキップして、ループ処理の最初から実行させたい場合に使用する制御文である。
                // countが2の場合、この後の処理をスキップ
                continue;
            }
            System.out.println("Continue01 = " + count);
        }
    }
}
