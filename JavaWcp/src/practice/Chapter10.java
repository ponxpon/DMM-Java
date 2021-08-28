// 10章【例外の基本を学ぼう】

package practice;

import java.sql.SQLException;

public class Chapter10 {
	public static void main(String[] args) {

		try {
			int array[] = { 1, 3, 5 };
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);

			// Exceptionが発生しない場合は出力される
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			// スタックトレースを出力
			e.printStackTrace();
		}

		// try-catch文を記述
		try {
			// ・throwSQLExceptionメソッドを呼び出し
			Chapter10.throwSQLException();
		// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			// printStackTraceでスタックトレースを出力
			e.printStackTrace();
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		} finally {
			// 例外発生しても出力するため、finallyブロックに記述
			System.out.println("throwSQLExceptionの呼び出し終了");
		}

		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	public static void validIndex(int[] array, int index) {
		// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
		// 配列のサイズは、lengthで取得
		if (array.length <= index) {
			// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
			throw new IllegalArgumentException(index + " はサイズの範囲外です");
		}
		System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
	}
	// スローされる例外が検査例外なので、throws文が必要
	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
        throw new SQLException("SQLエラーです");
    }
}
