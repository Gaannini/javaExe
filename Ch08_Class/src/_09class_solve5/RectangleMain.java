package _09class_solve5;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rc0 = new Rectangle();
		rc0.set(10, 10, 30, 30);

		Rectangle rc1 = new Rectangle();
		rc1.set(10, 10, 30, 30);

		Rectangle rc2 = new Rectangle();
		rc2.set(20, 20, 50, 50);

		rc0.show();
		rc1.show();
		rc2.show();

		if (rc0.equals(rc1))
			System.out.println("rc0과 rc1은 같습니다.");
		else
			System.out.println("rc0과 rc1은 다릅니다.");

		if (rc0.equals(rc2))
			System.out.println("rc0과 rc2은 같습니다.");
		else
			System.out.println("rc0과 rc2은 다릅니다.");
	}

}
