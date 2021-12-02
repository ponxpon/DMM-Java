// 4章【ジェネリクスについて学ぼう】ジェネリクスを使ったクラス

// 型パラメータにはelement(要素)のEやtype(型)のTなど、大文字の英字1文字を用いる事が多い。
public class Basket<E> {
	private E elem;

	Basket(E e) {
		elem = e;
	}

	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}
}
