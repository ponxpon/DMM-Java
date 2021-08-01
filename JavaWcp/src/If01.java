// 7章【条件分岐を学ぼう】

// if文とは、指定した条件により処理を分岐する制御文
public class If01 {
	public static void main(String[] args) {
		int number = 7;
		// if文
		// numberが5未満の場合、ブロックの処理を実行
		if (number < 5) {
			// 「◯は5未満です」を出力
			System.out.println(number + " は5未満です");
		}
		// if文
		// numberが10未満の場合、ブロックの処理を実行
		if (number < 10) {
			// 「◯は10未満です」を出力
			System.out.println(number + " は10未満です"); // 7 は10未満です
		}
		// if文
		// numberが15未満の場合、ブロックの処理を実行
		if (number < 15) {
			// 「◯は15未満です」を出力
			System.out.println(number + " は15未満です"); // 7 は15未満です
		}
	}
}
// 条件式の評価をして結果が「true」の場合にブロック内の処理が実行される。
// 「false」の場合にはif文のブロック内の処理は実行されず、後続のプログラムが行なわれる。

// if文の基本構文
// if (条件式) {
//    ブロック(処理文);
// }
