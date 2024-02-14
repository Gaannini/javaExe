package _02exception;

import java.util.Arrays;
import java.util.Scanner;

public class ifException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피제수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.println("제수 입력 >> ");
		int num1 = sc.nextInt();
		// 값에 대한 에러 대응 처리
		if (num1 == 0) {
			System.out.println("제수는 0이 될 수 없습니다.");
			return;
		}
		System.out.println("나눗셈의 결과는 " + (num0 / num1));

		final int MAX_ARR = 100;
		int[] arr = new int[MAX_ARR];
		System.out.println("숫자 입력 >> ");
		int input = sc.nextInt();
		System.out.println("저장한 배열 인덱스 입력(0~99) >> ");
		int idx = sc.nextInt();
		if (idx < 0 || idx > MAX_ARR - 1) {
			System.out.println("유효하지 않은 인덱스입니다.");
			return;
		}
		arr[idx] = input;
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
