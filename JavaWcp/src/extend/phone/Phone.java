// 13章【継承を理解しよう】

package extend.phone;

public interface Phone {
	final int MAX_NUMBER_DIGITS = 11;

    void call(String number);

    // defaultメソッドの宣言
    default void powerOff() {
        System.out.println("電源を切ります。");
    }
}

// 基本構文
//	[public] interface インターフェース名 extends インターフェース名, インターフェース名 {
		// デフォルトメソッドの宣言
//	    default 戻り値の型 メソッド名() {
        // デフォルト処理
//	    }
//	}