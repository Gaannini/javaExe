package _01method;

public class MethodEx3 {
	// num0과 num은 add함수의 지역변수이다.
	public static int add(int num0, int num1) {
		int result = num0 + num1;
		return result;
	}

	public static void main(String[] args) {
		// main함수의 지역변수로 Stack에 num0과 num1이 초기화되어 생성된다.
		int num0 = 10;
		int num1 = 5;
		int result = add(num0, num1);
		System.out.println("결과값은 " + result);

		int a = 3;
		int b = 7;
		int result1 = add(a, b);
		System.out.println("결과값은 " + result1);
	}

}
