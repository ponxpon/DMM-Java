// 4章【ジェネリクスについて学ぼう】
// ジェネリクス：型をパラメータとして抽象的に扱うことで、プログラムを汎用的に用いるためのしくみ

import java.util.ArrayList;
import java.util.List;

public class Generics01 {
	List<String> items = new ArrayList<String>();

	public void main(String[] args) {
		items.add("bag"); // OK

		// これ以下はString型ではない要素を追加しているのでコンパイルエラー
		// items.add(0);
		// items.add(true);
	}
}
