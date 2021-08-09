// 8章 確認問題

public class Chapter08 {
	public static void main(String[] args) {
		// 1.「while」文
		// 1以上5未満の数の2乗を出力
		int number = 1;
		while (number < 5) {
            System.out.println(number * number);
            number++; // 一回目,1×1＝1 二回目,2×2=4 三回目,3×3=9 四回目,4×4=16
            // 四回目にnumberがインクリメントされて5になるので四回目までループ処理が行われる。
        }
		// 2. 通常「for」文
		// 要素数が4の「int」配列を初期化
		// 配列のサイズ分ループして、要素を出力
		int array[] = { 1, 4, 14, 25 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            // 変数「i」を0で初期化してインクリメントしながら、変数「array」のサイズ分（array.length）、ループ処理を行う。
        }
        // 3. 拡張「for」文
        // 「2.」の配列をループ
        // 要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
        for (int val : array) {
        	// valを2で割った余りが0
            if (val % 2 == 0) {
            	// 偶数なら後の処理をスキップ
                continue;
            }
            // 奇数を出力
            System.out.println(val);
        }
	}
}
