/*
 * 정수 3개를 입력받 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
 */

package _10for;

import java.util.Scanner;

public class Resolve03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 수 입력
		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자입력 : ");
			arr[i] = sc.nextInt();
		}

		boolean cond0 = arr[0] + arr[1] > arr[2];
		boolean cond1 = arr[0] + arr[2] > arr[1];
		boolean cond2 = arr[1] + arr[2] > arr[0];

		boolean t = cond0 ? (cond1 ? (cond2) : false) : false;

		if (t)
			System.out.println("삼각형을 만들 수 있습니다.");
		else
			System.out.println("삼각형을 만들 수 없습니다.");
	}
}
