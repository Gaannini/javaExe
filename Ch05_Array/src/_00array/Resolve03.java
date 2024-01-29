//7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
package _00array;

import java.util.Scanner;

public class Resolve03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;

		int arr[] = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("점수 입력 : ");
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", (double) total / arr.length);

	}
}
