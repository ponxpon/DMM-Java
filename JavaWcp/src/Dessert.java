// 2章【列挙型を理解しよう】書き方

public enum Dessert {
	// APPLE, ICE_CREAM, CAKE;

	// 列挙型のさらなる活用
	// 値を追加できる：列挙型は、列挙したそれぞれのインスタンスにさらに値を持たせることができる。

	// それぞれに値段を指定する
    APPLE(100), ICE_CREAM(200), CAKE(300),;

  // 値段を保持するフィールド
    private int price;

  // コンストラクタを追加。引数はint型の値段。
    private Dessert(int price) {
        this.price = price;
    }

  // 値段を取得するメソッドを追加
    public int getPrice() {
        return price;
    }

	// 列挙型の機能
	// ordinal()：列強した順序をint型で返す。（0スタート）
	public static void main(String[] args) {
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());
	}
}
