// 3章【コレクションについて学ぼう】確認問題

package practice;

public class Soldier implements Character {
	// インターフェースのメソッドを「Soldier」用にオーバーライド
	public int attack() {
	    System.out.println("戦士の会心の一撃！");
	    return 100;
	}
}
