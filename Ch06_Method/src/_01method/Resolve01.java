//2개의 정수를 입력받고 큰 값을 반환하는 메서드와 작은 값을 반환하는 메서드를 작성하고 사용하세요
package _01method;

import java.util.Scanner;

public class Resolve01 {
	// 두 수중 작은 값을 반환하는 메소드
	public static int MinNumber(int n1, int n2) {
		if (n1 < n2)
			return n1;
		else
			return n2;
	}

	// 두 수중 큰 값을 반환하는 메소드
	public static int MaxNumber(int n1, int n2) {
		if (n1 > n2)
			return n1;
		else
			return n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 > ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 > ");
		int num2 = sc.nextInt();
		System.out.println("작은 값 : " + MinNumber(num1, num2));
		System.out.println("큰 값 : " + MaxNumber(num1, num2));
	}
}
