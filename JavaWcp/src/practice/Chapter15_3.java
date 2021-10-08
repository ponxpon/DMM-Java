// 15章【演習問題（番外編）】プリミティブ型のキャストの問題
// 問題：指定された実行結果になるように、コンパイルエラーのプログラム「Chapter15_3.java」にキャストを追加する。

package practice;

public class Chapter15_3 {
	public static void main(String[] args) {
		int i1 = 123;
		// 暗黙的にキャストされる。
		// データサイズが小さい型から大きい型は暗黙的にキャストされるため、明示的にキャストする必要がない。
		double d1 = i1;
		System.out.println(d1);

		double d2 = 12.345;
		// 明示的にキャストしないとコンパイルエラー
		// int i2 = d2;
		// データサイズが大きい型から小さい型への代入は明示的にキャストする必要がある。
		int i2 = (int) d2;
		System.out.println(i2);

		int i3 = 1;
		int i4 = 2;
		// キャストしないと期待の結果にならない
		// double d3 = i3 / i4;
		// int型同士の計算は計算結果もint型になり、小数点以下が切り捨てられてしまう。
		// そのため、どちらかの変数を浮動小数型のdouble型にキャストして、計算結果をdouble型にする必要がある。
		double d3 = (double) i3 / i4;
		System.out.println(d3);

		int i5 = 128;
		// 明示的にキャストしないとコンパイルエラー
		// byte b1 = i5;
		// 大きい型から小さい型への代入なので、明示的にキャストする必要がある。
		// byte型の上限値(127)より大きい値を代入しているため、元の値と違う値となってしまう。このようにデータサイズの上限値を超えてしまうことを「桁あふれ（オーバーフロー）」と言う。
		byte b1 = (byte) i5;
		System.out.println(b1);
	}
}
