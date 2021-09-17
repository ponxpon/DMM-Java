// 13章【継承を理解しよう】

package extend.human;

// クラスを継承する場合は、クラス名の後ろに「extends スーパークラス名」を記述する。
// クラスの継承で指定できるクラスは１つのみなので、複数のクラスを継承することはできない。
// 継承を使用すると、スーパークラスのメソッドやフィールドはそのまま利用して、追加したい処理だけを追加できるため、ソースコードの量を減らすことができる。
// Humanクラスを継承したEmployeeクラス
public class Employee extends Human {
	// サブクラスで追加したフィールド
	private String department;

    public Employee(String name, int age, String department) {
    	// スーパークラスのコンストラクタを呼び出し
        super(name, age);
        this.department = department;
    }

    // サブクラスで追加したメソッド
    public String getEmployeeProfile() {
    	// 親インスタンスのフィールドをthis変数で参照
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }
}

// 基本構文
// 修飾子 class クラス名 extends スーパークラス名 {
// サブクラスの処理
// }
