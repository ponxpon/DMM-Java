// 2章【列挙型を理解しよう】書き方

public enum Dessert {
	APPLE, ICE_CREAM, CAKE;

	// 列挙型の機能
	// ordinal()：列強した順序をint型で返す。（0スタート）
	public static void main(String[] args) {
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());
	}
}
