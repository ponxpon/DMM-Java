// 8章【繰り返しを学ぼう】

public class While01 {
	public static void main(String[] args) {
		int number = 100;
		// while文とは、指定の条件が「true」の間、繰り返し処理を行なう制御文である。
		// numberが50未満の場合、ブロックの処理を行なう。
		while (number < 50) {
			// numberにnumber * 2を代入して、numberを出力
			number *= 2;
			System.out.println("While01 = " + number);
		}
	}
}

// 基本構文
//	while (条件式) {
//	    ブロック（繰り返し処理）
//	}
