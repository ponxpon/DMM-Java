// 5章　参照型

public class Null02 {
	public static void main(String[] args) {
		// String型は文字列を扱うことができるクラス
		String string1;
		// ”あいう”の文字数を出力
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		// ””（空文字）の文字数を出力
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		// nullとは参照型変数の中身が何もないことを表現する特別な値
		// nullの変数を参照すると通称「ヌルポ」と呼ばれる「NullPointerException」のエラー
		string1 = null;
		System.out.println(string1 + "の文字数：" + string1.length());
	}
}
