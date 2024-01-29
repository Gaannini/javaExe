//두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고 사용해보세요. 
//메서드 호출 시 전달되는 값의 순서와 상관없이 절대값이 계산되어서 출력되어야 합니다
package _01method;

import java.util.Scanner;

public class Resolve02 {
	public static int Minus(int n1, int n2) {
		if (n1 > n2)
			return n1 - n2;
		else
			return n2 - n1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int result = Minus(num1, num2);
		System.out.println("두 수의 차는 " + result + "입니다.");
	}
}
