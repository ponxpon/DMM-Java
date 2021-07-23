// 5章　型の種類　プリミティブ型
// 文字型の解説

public class Null01 {
	public static void main(String[] args) {
		// 整数型　整数を扱う型は数値の大きさに合わせて４種類ある。
		// long long1 = 9223372036854775807;  // コンパイルエラーになる。
		// プログラム上の整数値は「int」型として扱われる。そのため「int」型の範囲外の整数をプログラムに記述する場合は、
		// 数値の最後に「L」を付けて、「long」型であること明示的に記述をする必要がある。
		long long2 = 9223372036854775807L;
		// 「short」型、「byte」型は明示的な記述をする必要はない。
		short short1 = 32767;
		byte byte1 = 127;

		// 浮動小数型　小数を扱う型は数値の大きさに合わせて２種類ある。通常は「double」型を使用する。
		double double1 = 1234567.89;
		double double2 = 1234567.89d;  // 明示的にすることも可能
		// プログラム上の小数値は「double」型として扱われる。明示的に「float」型を宣言する場合は数値の最後に「F」または「f」を付ける必要がある。
		// float float1 = 0.123;          // コンパイルエラー
		float float2 = 0.123f;

		// 論理型　論理型を扱う型は、「boolean」型の１種類である。
		// 格納できる値は真偽値の「true」と「false」の2つだけ。
		boolean boolean1 = true;
		boolean boolean2 = false;

		// 文字型　文字を扱う型は、「char」型の１種類である。
		char char1 = 'あ';
		char char3 = 'A';
		// char char2 = 'AB'     // コンパイルエラー
		char char4 = 0x3042;  // 文字コードでひらがなの「あ」を表現
		// 'あ';                 // プログラム上ではchar型
	}
}
