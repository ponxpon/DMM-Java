// 2章【列挙型を理解しよう】列挙型の機能

public class Dessert02 {
	// name()：列挙した定数名そのものをString型で返す。
	// System.out.println(Dessert.APPLE.name());

	// valueOf(String name)：name()とは逆に、String型の名称から列挙型のインスタンスを取得したい場合は、valueOf()を使う。
	// Dessert apple = Dessert.valueOf("APPLE");
	// System.out.println(apple);
	// valueOf()に列挙されていない文字列を指定すると例外が発生する。
}
