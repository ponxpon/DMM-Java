// 10章【例外の基本を学ぼう】
package exception;

// try-catch文は、例外処理を記述するために使用する。
public class Exception02 {
	public static void main(String[] args) {
		// tryブロックには、例外が発生する可能性がある処理を記述する。try文は必ず記述する必要がある。
		try {
			System.out.println("100 ÷ 0 は？");
			// Exception01と同じく、例外が発生
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		// catchブロックには、例外が発生した時に実行する処理を記述する。
		// tryブロックで発生した例外のクラスとcatch文に記述した例外クラスの型が一致した場合、そのcatch文のブロックの処理が実行される。
		} catch (ArithmeticException e) {
			// 例外クラスが一致するので、例外処理が実行される。
			System.out.println("例外が発生");
		// finallyブロックに、例外発生の有無にかかわらず必ず実行する処理を記述する。
		// finally文もcatch文と同じように、必ず実行する処理がなければ記述の必要はない。
		} finally {
			// 例外発生しても処理を実行
			System.out.println("プログラム終了");
		}
	}
}

// 基本文法
//	try {
//	    tryブロック（例外が発生する可能性がある処理）
//	} catch (例外クラス 変数名) {
//	    catchブロック（例外が発生した時に実行する処理）
//	} catch (例外クラス 変数名) {
//	    catchブロック（例外が発生した時に実行する処理）
//	} finally {
//	    finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
//	}
