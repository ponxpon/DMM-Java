// 3章【コレクションについて学ぼう】拡張for文
// Mapの場合、キー・値・キーと値のペアのいずれかをループの対象とすることができる。

import java.util.HashMap;
import java.util.Map;

public class For04 {
	Map<Integer, String> classmates = new HashMap<>();

	public void main(String[] args) {
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");

		// キーのみ
		for (Integer key : classmates.keySet()) {
			System.out.println(key); // 1, 2, 3の順に表示
		}

		// 値のみ
		for (String name : classmates.values()) {
			System.out.println(name); // 青木、石坂、小野田の順に表示
		}

		// キーと値のペア
		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
			System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // 1番は青木さん、2番は石坂さん、3番は小野田さんの順に表示
		}
	}
}
