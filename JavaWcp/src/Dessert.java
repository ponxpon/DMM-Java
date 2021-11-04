// 2章【列挙型を理解しよう】書き方

public enum Dessert {
	// APPLE, ICE_CREAM, CAKE;

	// 列挙型のさらなる活用
	// 値を追加できる：列挙型は、列挙したそれぞれのインスタンスにさらに値を持たせることができる。

	// それぞれに値段を指定する
//	APPLE(100), ICE_CREAM(200), CAKE(300),;

	// 値段を保持するフィールド
//	private int price;

	// コンストラクタを追加。引数はint型の値段。
//	private Dessert(int price) {
//		this.price = price;
//	}

	// 値段を取得するメソッドを追加
//	public int getPrice() {
//		return price;
//	}

	// 列挙型の機能
	// ordinal()：列強した順序をint型で返す。（0スタート）
//	public static void main(String[] args) {
//		System.out.println(Dessert.APPLE.ordinal());
//		System.out.println(Dessert.ICE_CREAM.ordinal());
//		System.out.println(Dessert.CAKE.ordinal());
//	}

	// 列挙型のさらなる活用
	// インスタンスごとにメソッドを追加することもできる。抽象メソッドを用意し、各インスタンスでそれを継承すると、インスタンスごとに実行したいコードの内容を変えることができて便利。
	// 先程と同様、値段の情報を持ったデザートを例にし、それぞれのデザートの宣伝文句を出力するメソッドを実装してみる。
	APPLE(100) {
	    @Override
	    void advertise() {
	      // りんご用のadvertiseの実装
	      System.out.println("まっかなりんごが" + getPrice() + "円！"); // getPriceメソッドも活用できる
	    }
	  },

	  ICE_CREAM(200) {
	    @Override
	    void advertise() {
	      // アイスクリーム用のadvertiseの実装
	      System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
	    }
	  },

	  CAKE(300) {
	    @Override
	    void advertise() {
	      // ケーキ用のadvertiseの実装
	      System.out.println("皆大好き甘いケーキが" + getPrice() + "円！");
	    }
	  },
	  ;

	  private int price;

	  private Dessert(int price) {
	    this.price = price;
	  }

	  public int getPrice() {
	    return price;
	  }

	  // 宣伝文句を出力する抽象メソッド。各インスタンスで実装する
	  abstract void advertise();

	  public static void main(String[] args) {
		  Dessert.APPLE.advertise(); // 「まっかなりんごが100円！」と出力
		  Dessert.ICE_CREAM.advertise(); // 「夏にぴったりアイスクリームが200円！」と出力
		  Dessert.CAKE.advertise(); // 「皆大好き甘いケーキが300円！」と出力
	  }
}
