//5명의 학생의 이름과 점수를 입력받고
//해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
package _00array;

import java.util.Scanner;

public class Resolve06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] score = new int[5];

		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째 학생 이름 : ");
			name[i] = sc.next();
			System.out.print((i + 1) + "번째 학생 점수 : ");
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째학생 > 이름 : " + name[i] + " 학점 : ");
			switch (score[i] / 10) {
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
			}
		}
	}
}
