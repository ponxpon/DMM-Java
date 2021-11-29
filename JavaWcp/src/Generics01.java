// 4章【ジェネリクスについて学ぼう】
// ジェネリクス：型をパラメータとして抽象的に扱うことで、プログラムを汎用的に用いるためのしくみ

import java.util.ArrayList;
import java.util.List;

public class Generics01 {
	List<String> items = new ArrayList<String>();

	public void main(String[] args) {
		// Stringが型パラメータとして指定されているため、String型要素は追加できるが、それ以外を追加しようとするとコンパイルエラーになる。
		items.add("bag"); // OK

		// これ以下はString型ではない要素を追加しているのでコンパイルエラー
		// items.add(0);
		// items.add(true);

		// 要素を取り出して使う際も、String型であることが保証されているため、異なる型の変数に代入することはできない。
		String item = items.get(0); // OK

		// これ以下はString型ではない変数に代入しているのでコンパイルエラー
		// int item = items.get(0);
		// boolean item = items.get(0);
	}
}
