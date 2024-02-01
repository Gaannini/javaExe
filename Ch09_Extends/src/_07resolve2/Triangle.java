package _07resolve2;

public class Triangle {
	static int high;
	static int base;

	public Triangle(int high, int base) {
		this.high = high;
		this.base = base;
		System.out.println("삼각형 높이 : " + high);
		System.out.println("삼각형 밑변 : " + base);
	}

	public void Change_high(int change_high) {
		this.high = change_high;
		System.out.println("삼각형의 높이를 " + high + "(으)로 변경하였습니다.");
	}

	public void Change_base(int change_base) {
		this.base = change_base;
		System.out.println("삼각형의 밑변를 " + base + "(으)로 변경하였습니다.");
	}

	public double TriangleArea() {
		return ((double) high * (double) base) / 2;
	}

}
