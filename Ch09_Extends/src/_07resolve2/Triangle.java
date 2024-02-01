package _07resolve2;

public class Triangle {
	static int high;
	static int base;

	public Triangle(int high, int base) {// 매개변수를 가진 생성자
		this.high = high;
		this.base = base;
		Triangle_show();
	}

	// 밑변과 높이를 모두 변경하는 메소드
	public void Change_All(int change_high, int change_base) {
		this.high = change_high;
		this.base = change_base;
		System.out.println("삼각형의 높이를 " + high + "(으)로 변경하고 밑변을 " + base + "(으)로 변경하였습니다.");
	}

	// 높이만 변경하는 메소드
	public void Change_high(int change_high) {
		this.high = change_high;
		System.out.println("삼각형의 높이를 " + high + "(으)로 변경하였습니다.");
	}

	// 밑변만 변경하는 메소드
	public void Change_base(int change_base) {
		this.base = change_base;
		System.out.println("삼각형의 밑변 " + base + "(으)로 변경하였습니다.");
	}

	public void Triangle_show() {
		System.out.println("삼각형 높이 : " + high);
		System.out.println("삼각형 밑변 : " + base);
	}

	// 삼각형의 넓이를 반환하는 메소드
	public double TriangleArea() {
		return ((double) high * (double) base) / 2;
	}
}
