// for문 1~100까지 정수중에 3의 배수의 총합 출력
package _11continue;

public class Resolve01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; true; i++) {
			int result = 3 * i;
			if (result < 100) {
				sum += result;
			} else
				break;
		}
		System.out.println("1~100까지의 정수 중 3의 배수들의 합 : " + sum);
	}

}
