// 7章 確認問題1

public class Chapter07 {
	public static void main(String[] args) {
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
	}
}
