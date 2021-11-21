// 3章【コレクションについて学ぼう】Set
// Setとは重複のない要素を管理するコレクション。Setは重複した要素を保持することができず、要素の順番も保証されない。

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set01 {
	// Setの生成
	// HashSetを生成する場合
	Set<String> set1 = new HashSet<String>();

	// LinkedHashSetを生成する場合
	Set<Integer> set2 = new LinkedHashSet<Integer>();

	public void main(String[] args) {
		// Setの操作

		// 要素の追加
		// 要素を追加する
		set1.add("スイカ");
		set1.add("メロン");

		// 要素の存在チェック：containsメソッド
		// 存在チェック (trueを返す)
		set1.contains("スイカ");

		// 存在チェック (falseを返す)
		set1.contains("なし");
	}
}
