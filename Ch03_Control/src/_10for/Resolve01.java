/*
 * 돈의 액수를 입금하세요
   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
   출력 개수는 단위가 큰 것 순서로 계산합니다
   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
 */

package _10for;

import java.util.Scanner;

public class Resolve01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();

		int money_50000 = price / 50000;
		int money_10000 = (price - money_50000) / 10000;
		int money_5000 = (price - money_50000) / 10000;

	}

}
