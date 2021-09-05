// 12章【カプセル化を理解しよう】確認問題

package practice;

public class CapsuleMan {
	// privateに変更して隠蔽化
	private String name;
	private int age;

	public CapsuleMan(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// メンバ変数のgetter,setterメソッドを定義する。nameのsetterは不要なので定義しない。
	// ageのgetter
	public int getAge() {
		return age;
	}

	// ageのsetter
	public void setAge(int age) {
		this.age = age;
	}

	// nameのgetter
	public String getName() {
		return name;
	}
	//nameのsetterは不要なので定義しない
}
