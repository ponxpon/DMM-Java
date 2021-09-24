// 13章【継承を理解しよう】確認問題

package practice;

public interface Flying {
	// メソッド（抽象メソッド）
    void fly();

    // defaultメソッド
    default void powerOff() {
        System.out.println("飛んでいる場合は落下します。");
    }
}
