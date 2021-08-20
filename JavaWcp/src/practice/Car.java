// 9章 確認問題
package practice;

public class Car {
	// 燃費（Km/L）
	private double fuelCost;
	// 残量（L）
	private double fuelAmount;

	// コンストラクタを作成
	// コンストラクタは、燃費・残量の引数を「double」型で定義し、引数をフィールドに代入する。
	public Car(double fuelCost, double fuelAmout) {
		// this変数
		// thisというキーワードで自分自身のインスタンスを指す変数を扱うことができる。自分自身のインスタンスのフィールドやメソッドであることを明示的にする場合に使用する。
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmout;
	}

	// moveメソッド
	// moveメソッドは、「int」型を引数にして定義する。「km + " km 走ります"」を出力する。残量から走った分の燃料を計算して、引き算する。
	public void move(int km) {
		// "xx km 走ります"を出力
		System.out.println(km + " km 走ります");
		// 残量を計算 減算代入を使用
		this.fuelAmount -= (km / fuelCost);
	}

	// fuelAmountを取得するメソッドを作成
	// フィールドの「fuelAmount」をreturnする。
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
