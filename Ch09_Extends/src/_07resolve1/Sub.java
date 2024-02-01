package _07resolve1;

public class Sub {
	static int a;
	static int b;

	static void setValue(int _a, int _b) {
		a = _a;
		b = _b;
	}

	public static int claculate() {
		return a - b;
	}
}
