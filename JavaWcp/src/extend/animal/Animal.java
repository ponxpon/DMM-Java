// 13章【継承を理解しよう】

// 抽象クラスとは、抽象メソッドを1つ以上持つクラスのこと。
// 抽象メソッドとは、処理を記述せずにメソッド名や引数、戻り値だけを定義したメソッドのこと。

package extend.animal;

public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました！");
	}

	public abstract void cry();
}
