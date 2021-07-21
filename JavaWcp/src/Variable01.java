// 4章【変数を学ぼう】

public class Variable01 {
	public static void main(String[] args) {
		// 変数を使用するには、変数を宣言する必要がある。基本構文(型 変数名;)
		int num1; // int型の変数num1を宣言
		String str1; // String型の変数str1を宣言
		// 変数の初期化とは、宣言した変数に初期値を代入すること。
		num1 = 10; // num1を初期化
		str1 = "Hello World!"; //str1を初期化
		System.out.println(num1);
		System.out.println(str1);
		// 変数は何度でも値を代入することができる。変数に値を再代入するとそれまで格納していた値は失われて、新しい値が格納される。
		num1 = 20; // num1に20を再代入
		System.out.println(num1);
		// 変数の初期化は変数の宣言と同時に行うこともできる。基本構文(型 変数名 = 代入するデータ;)
		int num2 = 30; // int型の変数num2を宣言と同時に初期化
		System.out.println(num2);
	}
}

