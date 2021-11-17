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
}
