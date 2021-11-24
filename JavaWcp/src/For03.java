// 3章【コレクションについて学ぼう】拡張for文
// どのコレクションも拡張for文を用いることで順番に要素を取り出し処理を行うことができる。

import java.util.ArrayList;
import java.util.List;

public class For03 {
	List<String> list1 = new ArrayList<String>();

	// Listの例
	public void main(String[] args) {
		List<String> prefectures = new ArrayList<>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");

		for (String prefecture : prefectures) {
			System.out.println(prefecture); // 北海道、青森県、秋田県の順に表示
		}
	}
}
