//int배열을 10개 생성하세요.
//사용자로부터 10개의 값을 입력받고
//순서대로 출력하고  총합을 구하세요
package _00array;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + total);
	}
}
