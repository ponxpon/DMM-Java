// 13章【継承を理解しよう】

package extend.phone;

// Phone,Cameraインターフェースを実装したMobilePhoneクラスの宣言
public class MobilePhone implements Phone, Camera {
	private String number;

	public MobilePhone(String number) {
		this.number = number;
	}

	// Cameraインターフェースのメソッドを実装
	public void takePicture() {
		System.out.println("写真をとります。");
	}

	// Phoneインターフェースのメソッドを実装
	public void call(String number) {
		System.out.println(this.number + " から " + number + " に電話をかけます。");
	}
}

// インターフェースを実装する場合は、クラス名の後ろに「implements インターフェース名」を記述する。
// 修飾子 class クラス名 implements インターフェース名, インターフェース名 {
		// インターフェースを実装したメソッドなど
// }
