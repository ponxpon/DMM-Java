// 8章【繰り返しを学ぼう】

public class DoWhile01 {
	public static void main(String[] args) {
        int number = 100;
        // do-while文とは、while文と同じように指定の条件が「true」の間、繰り返し処理を行なう制御文である。
        do {
        	// // numberにnumber * 2を代入して、numberを出力
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        // numberが50未満の場合、ブロックの処理をループ実行する
        } while (number < 50);
    }
}

// ブロックの処理を実行し、処理が完了した後に条件式を評価する。
// そのため、仮にはじめから条件式の結果が「false」となっていても、while文とは異なり、最低1度はブロックの処理が実行される。

// 基本構文
//	do {
//	    ブロック（繰り返し処理）
//	} while (条件式);
