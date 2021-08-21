// 5章 参照型

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

		// ラッパークラスとはプリミティブ型を参照型として扱えるようにできるクラスのこと。
		// プリミティブ型の値をラッパークラス型へ変換することをボクシングと言う。
		// 逆にラッパークラス型の値からプリミティブ型への変換をアンボクシングと言う。
		// int型の値をボクシングするには「valueOf」というメソッド、
		// Integer型の値をアンボクシングするには「intValue」というメソッドを用いることで変換が可能
		Integer integer1 = 5;                   // オートボクシング
		Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
		int int1 = integer1;             // アンボクシング
		int int2 = integer2.intValue();  // 明示的なアンボクシング

		// 配列とは同じ型の複数のデータを１つの変数で扱えるようにしたもの
		int[] array1 = new int[3];  // 配列の宣言と生成
		array1[0] = 60;  // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20;  // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 20;  // ３番目と同じ値を２番目の要素に代入
		int int3 = array1[2];  // インデックス番号「2」を指定して３番目の要素を取得

		int array2[] = null;  // []は変数名の後ろでも可

		// 変数と同じように宣言と同時に初期化することももできる。
		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 10, 20, 50 };
	}
}
