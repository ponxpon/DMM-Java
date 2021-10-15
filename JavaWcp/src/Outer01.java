// 応用編 1章【内部クラスについて学ぼう】内部クラスと外部クラスの関係性

public class Outer01 {
	// 外部クラスに定義したフィールドgreeting
	private String greeting = "こんにちは";

	// 内部クラスは、外部クラスのフィールドを直接参照することができる。
	public class Inner {

		public String hello() {
			// 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
			return greeting;
		}
	}
}
