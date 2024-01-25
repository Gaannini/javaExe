//양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요

package _10for;

import java.util.Scanner;

public class Resolve12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++)
			System.out.println("감사합니다.");
	}

}
