/*
   사용자로부터 정수를 입력받습니다.
   입력 받은 값을 계속 더합니다
   사용자가 0을 입력하면 합을 출력합니다
   프로그램을 종료합니다.
 */

package _10for;

import java.util.Scanner;

public class Resolve15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (; true;) {
			System.out.print("정수입력:");
			int num = sc.nextInt();
			if (num != 0)
				sum += num;
			else
				break;
		}
		System.out.println("합 = " + sum);

	}

}
