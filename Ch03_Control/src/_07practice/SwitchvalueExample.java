package _07practice;

public class SwitchvalueExample {

	public static void main(String[] args) {
		char grade = 'B';
		int score = switch (grade) {
		case 'A' -> 100;
		case 'B' -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};

		System.out.println(score);
	}
}