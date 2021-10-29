// 2章【列挙型を理解しよう】列挙型の特徴

public enum Dessert01 {
	// 列挙型もほかのクラスと同じように、変数に代入して使うことができる。
	// Dessert apple = Dessert.APPLE;
	// Dessert iceCream = Dessert.ICE_CREAM;
	// Dessert cake = Dessert.CAKE;

	// 引数の型に用いることができる。
	// static void printDessertName(Dessert dessert){
	//     System.out.println(dessert);
	// }
	// このような名前の出力はこれまでString型の引数を用いて実現していたが、こうして列挙型を使うことで、意味の異なる別の引数を渡すことを防ぎやすくなる。

	// 新しいインスタンスを生成できない。
	// Dessert orange = new Dessert();
	// 列挙型はクラスとは違い、これはコンパイルエラーになる。
	// 列挙型のコンストラクタは、コンパイル時に自動で作成されるが、privateなので外部から呼ぶことができない。

	// ==で比較できる。
	// String x = new String("あ");
	// String y = new String("あ");
	// System.out.println(x == y); // falseを返す。
	// System.out.println(x.equals(y)); // trueを返す。
	// 参照型（Object型）に対して==を使う場合は、==は、インスタンスが完全に同一である場合のみtrueを返す。

	// 列挙型の場合
	// Dessert x = Dessert.APPLE;
	// Dessert y = Dessert.APPLE;
	// System.out.println(x == y); // trueを返す。
	// System.out.println(x.equals(y));    // trueを返す。
}
