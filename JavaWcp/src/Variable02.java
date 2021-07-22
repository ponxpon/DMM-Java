// 4章【変数を学ぼう】

// 定数とは最初に代入した値を後から変更できない変数のこと。final修飾子を記述することで定数になる。
public class Variable02 {
	public static void main(String[] args) {
		// 定数の宣言 基本構文(final 定数の型 定数名 = 初期値;)
		final int MIN_NUMBER = 10;
		System.out.println(MIN_NUMBER);

		// 再代入しようとするとエラー
		// MIN_NUMBER = 20;
	}
}
