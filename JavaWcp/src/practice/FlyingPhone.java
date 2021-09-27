// 13章【継承を理解しよう】確認問題

package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int minutes;

	// 「int」型の引数を持つコンストラクタを定義。引数でメンバ変数を初期化。
    public FlyingPhone(int minutes) {
        this.minutes = minutes;
    }

    // Phoneインターフェースのメソッドをオーバーライド
    public void call(String number) {
        System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
    }

    // Flyingインターフェースのメソッドをオーバーライド
    public void fly() {
        System.out.println(minutes + " 分間、飛びます。 ");
    }

    // 「Phone」と「Flying」の両インターフェースにdefaultメソッドがあるのでオーバーライドする必要がある。
    public void powerOff() {
    	// Flyingのdefaultメソッドを呼び出す
        Flying.super.powerOff();
    }
}
