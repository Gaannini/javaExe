package _07practice;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A', 'a' -> System.out.print("우수 회원입니다");

		case 'B', 'b' -> System.out.print("일반 회원입니다");

		default -> System.out.print("우수회원입니다");

		}
	}
}