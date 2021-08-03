// 7章 確認問題

public class Chapter07 {
	public static void main(String[] args) {
		// 確認問題1
		int number = 5;
		// 5km以下
		if (number <= 5) {
			System.out.println("とても近いです");
		// 5kmより長く10km以下
		} else if (number <= 10) {
			System.out.println("近いです");
		// 10kmより長く15km以下
		} else if (number <= 15) {
			System.out.println("遠いです");
		// 15kmより長い
		} else {
			System.out.println("とても遠いです");
		}

		// 確認問題2
		String color = "red";
		// // switch文：分岐処理の開始
		switch (color) {
		// 値がredの場合にブロックを実行
		case "red":
			System.out.println("赤信号です");
			break;
		// 値がyellowの場合にブロックを実行
		case "yellow":
			System.out.println("黄信号です");
			break;
		// 値がblueの場合にブロックを実行
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
