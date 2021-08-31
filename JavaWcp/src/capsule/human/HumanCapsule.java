// 12章【カプセル化を理解しよう】

package capsule.human;

public class HumanCapsule {
	// メソッドやフィールドにアクセス修飾子を設定してアクセスを制限することで、誤って外部のプログラムが変更禁止のフィールドを変更してしまうことを防止する。
	// privateのアクセス修飾子を設定して外部から隠蔽
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// フィールドにアクセス制限を「private」にすることで、他のプログラムによる直接の変更を禁止できるようになるが、同時に値の取得もできなくなってしまう。
	// そのため、フィールドの値を取得するための「getter」メソッドや値を変更するための「setter」メソッドを必要に応じて作成して、他のプログラムから参照できるようにする。

	// nameのgetterメソッド
	public String getName() {
		return this.name;
	}

	// nameのsetterメソッド
	public void setName(String name) {
		this.name = name;
	}

	// ageのgetterメソッド
    // ageは外部から変更禁止なので、setterメソッドは作成しない。
	public int getAge() {
		return this.age;
	}
}

// 基本構文
// getterメソッド
//	public 戻り値の型(フィールドの型)  getフィールド名() {
//	 return this.フィールド名
//	}

// setterメソッド
//	public void setフィールド名(フィールドの型の引数) {
//	 this.フィールド名 = フィールドの型の引数;
//	}
