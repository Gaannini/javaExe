package _07resolve2;

public class TriangleMain {

	public static void main(String[] args) {

		// 첫번째 객체
		Triangle tri1 = new Triangle(10, 5);
		System.out.println("삼각형의 넓이는 " + tri1.TriangleArea() + "입니다");
		// 높이변경
		tri1.Change_high(5);
		System.out.printf("삼각형의 넓이는 %.1f 입니다\n", tri1.TriangleArea());

		System.out.println();

		// 두번째 객체
		Triangle tri2 = new Triangle(35, 3);
		System.out.printf("삼각형의 넓이는 %.1f 입니다\n", tri2.TriangleArea());
		// 밑변경
		tri2.Change_base(10);
		System.out.printf("삼각형의 넓이는 %.1f 입니다\n", tri2.TriangleArea());
	}

}