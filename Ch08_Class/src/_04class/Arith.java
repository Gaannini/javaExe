package _04class;

/**
 * 객체가 최초 생성될 때 비로서 메서드가 메모리에 올라간다. 객체가 있어야 사용가능하다.
 * 
 * 객체의 변수 값에 따라 영향을 받는 메서드는 일반 메서드로 만든다.
 */
public class Arith {
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}

	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	public int div(int n1, int n2) {
		return n1 / n2;
	}
}
