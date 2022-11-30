/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-14 p121
 * 	演習04-13のプログラムを書き換えて、下記のように
 *  式を表示するプログラムを作成せよ。
 *
 *  例）nの値が5のときの表示「1+2+3+4+5」
 *
 * 回答:
 *  下記プログラム（//★演習04-14回答 以降）をご参照ください。
 *
 * パッケージ名:ensyu04_14
 * クラス名:ensyu04_14
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_14;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_14 {

	public static void main(String[] args) {
		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//説明
		System.out.println("1からnまでの和を求めます");
		//nを初期化
		int n;

		do {
			//入力を促す
			System.out.println("nの値：");
			//nに入力値を代入
			n = ins.nextInt();
		} while (n <= 0);

		//n>0が以降の処理に入る
		int sum = 0; //合計
		int i = 1; //回数

		//★演習04-14回答
		for (; n >= i; i++) {
			sum+= i;
			//式の数字を表示する
			System.out.print(i);
			//n=iでないとき、式の「+」を表示する
			if (n > i) {
				//式の「+」を表示する
				System.out.print('+');
			} else {
				; //空文
			}
		}
		System.out.println("=" + sum);
	}
}
