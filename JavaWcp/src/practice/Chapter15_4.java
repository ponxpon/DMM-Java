// 15章【演習問題（番外編）】スレッドの問題

package practice;

public class Chapter15_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			// Runnableインターフェースを実装したクラスをスレッドの実行は以下で行う。
			// 1.ThreadSampleクラスのインスタンスを生成
			ThreadSample mt = new ThreadSample(i);
			// 2.Threadクラスのインスタンスを作成
			Thread thread = new Thread(mt);
			// 3.Threadクラスのstartメソッドを呼び出す。
			thread.start();
		}

		for (int i = 1; i <= 3; i++) {
			try {
				// Thread.sleepは、指定したミリ秒間スリープするメソッド
				Thread.sleep(1000);
				// 1000ミリ秒（1秒）間スリープしてメッセージを表示
				System.out.println("Chapter15_4のスレッド : " + i + "回目");
				// Thread.sleepの例外処理
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
