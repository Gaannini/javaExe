package _01method;

import java.util.Scanner;

//메서드를 만들기 전 코드
public class MethodEx2 {
	public static void CalcArith(int num0, int num1, String op) {
		int result = 0;

		switch (op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default:
			System.out.println("연산불가");
			break;
		}
		System.out.println(num0 + " " + op + " " + num1 + " = " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("연산자 입력(+. -. *, /, %) >> ");
		String op = sc.next();

		CalcArith(num0, num1, op);
	}

}
