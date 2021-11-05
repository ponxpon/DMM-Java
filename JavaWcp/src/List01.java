// 3章【コレクションについて学ぼう】List
// Listとは、配列と同じようにインデックス番号の順序に要素（オブジェクト）を管理するコレクションである。
// Listは、重複した要素を保持することができる。配列との違いは、オブジェクト生成時に要素数の指定は必要がなく、要素を追加・削除するたびにサイズが増減すること。
// Listはインターフェースなので、使用する場合は、Listを実装しているクラスを使用する必要がある。

// Listの生成
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	// ArrayListを生成する場合
	List<String> list1 = new ArrayList<String>();

	// LinkedListを生成する場合
	List<Integer> list2 = new LinkedList<Integer>();
}
