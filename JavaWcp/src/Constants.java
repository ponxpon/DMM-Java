// 応用編 1章【内部クラスについて学ぼう】内部クラスを使うケース

// 内部クラスでまとまって書くことにより、内部クラスを使わずに定数化した場合より、コードが読みやすくなる。
public class Constants {
	// 内部クラスCatの中に、猫関係の定数を定義
	public static class Cat {
		public static final String NAME = "猫";
		public static final int LEG_COUNT = 4;
	}

	// 内部クラスOctopusの中に、タコ関係の定数を定義
	public static class Octopus {
		public static final String NAME = "タコ";
		public static final int LEG_COUNT = 8;
	}
}
