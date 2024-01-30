package _03class;
/*
 * static 메서드는 객체를 만들지 않아도 메모리에 자동으로 올라간다.
 * 
 * [용도]
 * 범용적인 기능의 함수를 만들 때
 * 어느 곳에서나 쉽게 사용하고 싶은 함수를 만들 때
 * 객체에 따라 변수의 값의 적용을 다르게 받지 않아도 될 때
 */

public class Arith {
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static int sub(int n1, int n2) {
		return n1 - n2;
	}

	public static int mul(int n1, int n2) {
		return n1 * n2;
	}

	public static int div(int n1, int n2) {
		return n1 / n2;
	}
}
