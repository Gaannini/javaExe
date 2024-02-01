package _09class_solve5;

public class Rectangle {
	int x1, y1, x2, y2;

	void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// 사각형 넓이 리턴
	int square() {
		int base = Math.abs(x1 - x2);
		int height = Math.abs(y1 - y2);
		return base * height;
	}

	// 좌표와 넓이 등 직사각형 정보의 화면 출력
	void show() {
		int leftX = x1 < x2 ? x1 : x2;
		int topY = y1 < y2 ? y1 : y2;
		int rightX = x1 > x2 ? x1 : x2;
		int bottomY = y1 > y2 ? y1 : y2;

		System.out.println("좌상단 x1 = " + leftX);
		System.out.println("좌상단 y1 = " + topY);
		System.out.println("우하단 x2 = " + rightX);
		System.out.println("좌하단 y1 = " + bottomY);
		System.out.println("넓이 = " + square());
	}

	// 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴
	public boolean equals(Rectangle r) {
		if (this.x1 == r.x1 && this.y1 == r.y1 && this.x2 == r.x2 && this.y2 == r.y2)
			return true;

		return false;
	}

}
