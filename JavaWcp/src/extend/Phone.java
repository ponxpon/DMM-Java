// 13章【継承を理解しよう】

package extend;

// インターフェースとは、定数と抽象メソッドだけを持つクラスのようなもの。
// インターフェースはクラスで実装して利用する。実装したクラスはインターフェース内の抽象メソッドを実装する必要がある。

//Phoneインターフェースの宣言
public interface Phone {
	// フィールドの宣言（定数）
	int MAX_NUMBER_DIGITS = 11;
	// public abstractが自動で追加される（抽象メソッド）
    public void call(String number);
}

// 基本構文
// 継承する場合は、クラスの継承と同じようにインターフェース名の後ろに「extends インターフェース名」を記述する。
//	[public] interface インターフェース名 extends インターフェース名, インターフェース名 {
		// フィールドの宣言（定数）
//	    (public static final) 定数の型 定数名 = 初期値;
		// メソッドの宣言（抽象メソッド）
//	    (public abstract) 戻り値の型 メソッド名(引数);
//	}
