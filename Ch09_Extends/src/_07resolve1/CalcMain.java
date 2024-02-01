package _07resolve1;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 연산할 수 입력
		System.out.print("첫번째 수 입력 > ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 > ");
		int num2 = sc.nextInt();

		// 덧셈
		Add.setValue(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + Add.claculate());
		// 뺄셈
		Sub.setValue(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + Sub.claculate());
		// 곱셈
		Mul.setValue(num1, num2);
		System.out.println(num1 + " X " + num2 + " = " + Mul.claculate());
		// 나눗셈
		Div.setValue(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + Div.claculate());
	}
}
