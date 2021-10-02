// 15章【演習問題（番外編）】再帰の問題
// 問題:最大公約数を「ユークリッドの互除法」で算出する再帰メソッドを呼び出して、以下の実行結果になるように「Chapter15_1.java」を作成する。

package practice;

public class Chapter15_1 {
	public static void main(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
	// 大きい数を小さい数（割った数）で割り、割った数を余りで割る。さらに割った数を余りで割り、余りが0になるまで計算する。余りが0になった時の割った数が最大公約数となる。
    static int gcd(int a, int b) {
    	// b(余り)が0になった時のaが最大公約数
        if (b == 0) {
            return a;
        }
        // 再帰呼び出し
        return gcd(b, a % b);
    }
}
