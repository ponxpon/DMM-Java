// 6章【演算子を学ぼう】

public class Operator01 {
	public static void main(String[] args) {
		// 演算子とオペランド
		// 計算をするときに使われる「+」や代入するときに使われる「=」などの記号を演算子と呼ぶ。
		// また「b = a + 3」のような文のことを式と呼び、「a」や「3」のように演算の対象となる部分をオペランドと呼ぶ。
		int a = 15;
		int c;
		c = a + 3; // 加算 c = 18
		c = a - 5; // 減算 c = 10
		c = a * 2; // 乗算 c = 30
		c = a / 6; // 徐算(「a」を「b」で割る) c = 2
		c = a % 4; // 余剰算(「a」を「b」で割った余り) c = 3
		System.out.println(c);

		// 数値型の変数の値に１増加する演算子をインクリメント演算子、１減少する演算子をデクリメント演算子と呼ぶ。
		int b;
		b = 10;
		b++;  // 「b」を1増加する。 b = 11
		b = 10;
		b--;  // 「b」を1減少する。 b = 9

		// インクリメント・デクリメントには、演算子を前につける前置と後ろにつける後置がある。
		int d;
		int e;

		d = 5;
		e = ++d;  // 「d」をインクリメントした後に、「d」 が 「e」 に代入される
		// それぞれの値は、「d」が「6」で 「e」も「6」

		d = 5;
		e = d++;  // 「d」を 「e」に代入した後に、「d」がインクリメントされる
		// それぞれの値は、「d」が「6」で 「e」が「5」

		// 代入演算子とは、変数に値を代入したい場合や計算した結果を代入したい場合に使用する。
		int f;

		f = 10;  // f = 10：fに10を代入
		f += 5;  // f = 15：fにf+5の結果を代入
		f -= 3;  // f = 12：fにf-3の結果を代入
		f *= 4;  // f = 48：fにf*4の結果を代入
		f /= 2;  // f = 24：fにf/2の結果を代入
		f %= 7;  // f = 3 ：fにf%7の結果を代入

		// 関係演算子とは、2つの値が大きいか、小さいか、等しいかを調べる場合に使用する。
		int g = 5;
		boolean h;

		// 「g」が「5」より小さい場合にtrue
		h = g < 5;   // h = false
		// 「g」が「5」より小さいか等しい場合にtrue
		h = g <= 5;  // h = true
		// 「g」が「4」より大きい場合にtrue
		h = g > 4;   // h = true
		// 「g」が「6」より大きいか等しい場合にtrue
		h = g >= 6;  // h = false
		// 「g」と「5」が等しい場合にtrue
		h = g == 5;  // h = true
		// 「g」と「5」が等しくない場合にtrue
		h = g != 5;  // h = false
		System.out.println(h);

		// 論理演算子は複数の式を条件とする場合に使用する。
		boolean i = true;
		boolean j = false;
		boolean k;

		// 「i」と後続の記述の両方がtrueの場合にtrue　&&：論理積（AND）
		k = i && true;   // k = true
		k = i && false;  // k = false
		// 「j」または後続の記述がtrueの場合にtrue　||：論理和（OR）
		k = j || true;   // k = true
		k = j || false;  // k = false
		// 「i」がfalseの場合にtrue　!：否定（NOT）
		k = !i;          // k = false
		// 「j」がfalseの場合にtrue
		k = !j;          // k = true

		// 文字列を連結する場合の演算子は算術演算子の足し算と同じ「+」になる。
		String l = "100";
		String m = "200";
		String n;
		n = l + m; // n = 100200
		n = "あ" + "い"; // n = あい

		// == 演算子は文字列の比較に用いることが出来る。
		String o = "applePie";
		String p = "applePie";
		r = o == p; // r = true

		// 文字列リテラルを定義した場合は文字列の内容が一致しているとtrueを返すが、次のようなケースではfalseを返す。
		String s = "applePie";
		String t = "apple";
		String u = t + "Pie";
		v = s == u;  // v = false
	}
}
