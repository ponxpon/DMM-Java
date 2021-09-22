// 13章【継承を理解しよう】

package extend;

// インターフェースとは、定数と抽象メソッドだけを持つクラスのようなもの。
// インターフェースはクラスで実装して利用する。実装したクラスはインターフェース内の抽象メソッドを実装する必要がある。

public interface Phone {
	int MAX_NUMBER_DIGITS = 11;

    public void call(String number);
}
