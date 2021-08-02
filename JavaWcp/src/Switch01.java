// 7章【条件分岐を学ぼう】

// switch文とは、変数の値を条件にして処理を分岐する制御文である。
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		// // switch文：分岐処理の開始
		switch (val) {
		// 変数とcaseの値が一致する場合、ブロック内の処理を実行する。
		// 値が3の場合にブロックを実行
		case 3:
			System.out.println("よくできました！");
			// break文が処理されると、それ以降のcase文は評価されずに、switch文の分岐処理を終了する。
			break;
		// 値が2の場合にブロックを実行
		case 2:
			System.out.println("ふつうでした！");
			break;
		// 全てcase文の値と一致しない場合、default内のブロックの処理が実行される。
		default:
			System.out.println("がんばろう！");
		}
	}
}

// 基本文法
//	switch (式（変数や値）){
//	case 値:
//	   ブロック(処理);
// 	   break;
//	case 値:
//	    ブロック(処理);
//	    break;
//	default:
//	    ブロック(処理);
//	}
