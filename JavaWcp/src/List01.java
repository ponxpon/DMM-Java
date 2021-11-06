// 3章【コレクションについて学ぼう】List
// Listとは、配列と同じようにインデックス番号の順序に要素（オブジェクト）を管理するコレクションである。
// Listは、重複した要素を保持することができる。配列との違いは、オブジェクト生成時に要素数の指定は必要がなく、要素を追加・削除するたびにサイズが増減すること。
// Listはインターフェースなので、使用する場合は、Listを実装しているクラスを使用する必要がある。

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Listの生成
public class List01 {
	// ArrayListを生成する場合
	List<String> list1 = new ArrayList<String>();

	// LinkedListを生成する場合
	List<Integer> list2 = new LinkedList<Integer>();

	// Listの操作

	// 要素を追加する
	// list1.add("りんご");
	// list1.add("みかん");

	// 位置を指定して要素を追加する
	// list1.add(1, "バナナ");

	// 要素の取得：getメソッドを使用
	// 要素を取得する
	// list1.get(0);

	// 要素の存在チェック：containsメソッドを使用
	// 存在チェック (trueを返す)
	// list1.contains("バナナ");

	// 存在チェック (falseを返す)
	// list1.contains("なし");
}
