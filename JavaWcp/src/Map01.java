// 3章【コレクションについて学ぼう】Map
// Mapとは、「キー」と「値」の組み合わせで要素を管理するコレクションである。
// Mapは1つの「キー」に対して、1つの「値」が存在する。そのため、キーは重複して保持することができない。値は重複して保持することができる。

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
	// Mapの生成
	// HashMapを生成する場合
	Map<Integer, String> map1 = new HashMap<Integer, String>();

	// TreeMapを生成する場合
	Map<String, String> map2 = new TreeMap<String, String>();

	public void main(String[] args) {
		// Mapの操作

		// 要素の追加：putメソッド
		// 要素を追加する。
		map1.put(0, "ぶどう");
		map1.put(3, "もも");

		// 登録済みのキーで追加すると上書きされる。
		map1.put(0, "マスカット");

		// 要素の取得：getメソッド
		// 要素を取得する
		map1.get(0); // マスカットを返す
		map1.get(1); // nullを返す

		// 要素の存在チェック：containsKeyやcontainsValueを使う。
		// キーの存在チェック (trueを返す)
		map1.containsKey(0);

		// 値の存在チェック (falseを返す)
		map1.containsValue("ぶどう");
	}
}
