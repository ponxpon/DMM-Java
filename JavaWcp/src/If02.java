// 7章【条件分岐を学ぼう】

// else-if文とは、複数の条件を指定して処理を分岐させるための制御文で、
// else文とは、全てのif文、else-if文の条件を満たさない場合に処理を実行するための制御文である。
public class If02 {
	public static void main(String[] args) {
        int number = 7;
        // if文
        // numberが5未満の場合、ブロックの処理を実行
        if (number < 5) {
        	// 「◯は5未満です」を出力
            System.out.println(number + " は5未満です");
        // else-if文
        // 前のif文の条件式の評価が全てfalseで、numberが10未満の場合、ブロックの処理を実行
        } else if (number < 10) {
        	// 評価がtrueなので、処理が実行される
        	// 「◯は5以上、10未満です」を出力
            System.out.println(number + " は5以上、10未満です");
        // else-if文
        // 前のif文の条件式の評価が全てfalseで、numberが15未満の場合、ブロックの処理を実行
        } else if (number < 15) {
        	// 評価はtrueだが、前の評価がtrueのため実行されない
        	// 「○は10以上、15未満です」を出力
            System.out.println(number + " は10以上、15未満です");
        // else文
        // 前の条件式の評価が全てfalseの場合、ブロックの処理を実行
        } else {
        	// 「○は15未満ではないです」を出力
            System.out.println(number + " は15未満ではないです");
        }
    }
}

// 基本構文
// if (条件式) {
//     ブロック(処理文);
// } else if (条件式) {
//     ブロック(処理文);
// } else if (条件式) {
//     ブロック(処理文);
// } else {
//     ブロック(処理文)
// }

