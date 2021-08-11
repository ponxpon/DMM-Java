// 9章【クラスとメソッドを理解しよう】

// アクセス修飾子publicを用いてどこからでもアクセスできるクラスHuman01を定義
public class Human01 {
	// アクセス修飾子publicを用いてどこからでもアクセスできるメンバー変数nameとageを定義
	public String name; // メンバー変数
    public int age;  // メンバー変数

    // 引数なしのコンストラクタを定義
    public Human01() {
        name = "山田";
        age = 20;
    }
    // 引数2つのコンストラクタを定義
    public Human01(String name, int age) {
    	// thisというキーワードで自分自身のインスタンスを指す変数を扱うことができる。
    	// 自分自身のインスタンスのフィールドやメソッドであることを明示的にする場合に使用する。
        this.name = name;
        this.age = age;
    }
}
