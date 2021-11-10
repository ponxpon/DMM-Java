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
}
