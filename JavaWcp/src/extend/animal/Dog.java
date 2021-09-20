// 13章【継承を理解しよう】

package extend.animal;

//抽象クラスとは、抽象メソッドを1つ以上持つクラスのこと。
//抽象メソッドとは、処理を記述せずにメソッド名や引数、戻り値だけを定義したメソッドのこと。

// 抽象クラスのAnimalクラスを継承
public class Dog extends Animal {
	public Dog() {
        this.name = "犬";
    }

	// 抽象メソッドを上書きして処理を記述
    public void cry() {
        System.out.println(this.name + "が吠えました。ワン！ワン！");
    }
}

// 基本構文
// 抽象クラスの宣言
// 「abstract」修飾子を指定してクラスを宣言することで抽象クラスになる。
// アクセス修飾子 abstract class クラス名 {
   // 抽象メソッドの宣言
   // アクセス修飾子 abstract 戻り値の型 メソッド名(引数);
// }
