// 応用編 1章【内部クラスについて学ぼう】クラス間の関連性を強調するケース

// タコクラス
//	public class Tako {
//	}

// タコの吸盤クラス
//	public class TakoSucker {
//	}

// 内部クラスを用いる事で、フラットにクラスが並んでいた状態より、関連が明らかに出来る。

// タコクラス
public class Tako {
	// タコの吸盤クラス
	  public class TakoSucker {
	  }
}

// 内部クラスは、外側と内側の「関連」を表現できる強みがある。
