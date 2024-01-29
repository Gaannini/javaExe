//int result = total(10, 100);
//위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//total메서드를 작성하고 사용해보세요.
package _01method;

import java.util.Scanner;

public class Resolve03 {
	public static int Total(int n1, int n2) {
		int result = 0;
		for (int i = n1; i <= n2; i++) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int sum = Total(num1, num2);
		System.out.println(num1 + "부터 " + num2 + "까지의 총 합은 " + sum + "입니다.");
	}
}
