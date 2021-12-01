// 4章【ジェネリクスについて学ぼう】確認問題1

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Generic02 {
	Set<Integer> set = new LinkedHashSet<>();

	public void main(String[] args) {
		set.add(1); // OK
		// set.add("Two"); // コンパイルエラー

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		// int value = map.get(0); // コンパイルエラー
	}
}
