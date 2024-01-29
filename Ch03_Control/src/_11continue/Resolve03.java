//while문과 Scanner의 nextLine()메서드를 이용해서
//예금, 출금, 조회, 종료 기능 제공

package _11continue;

import java.util.Scanner;

public class Resolve03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0; // 잔고
		int price; // 예금/출금 할 금액

		while (true) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("예금액 > ");
				price = sc.nextInt();
				balance += price;
				System.out.println();
				continue;
			case 2:
				System.out.print("출금액 > ");
				price = sc.nextInt();
				balance -= price;
				System.out.println();
				continue;
			case 3:
				System.out.println("잔고 > " + balance);
				System.out.println();
				continue;
			case 4:
				System.out.println();
				System.out.println("프로그램 종료");
				break;
			}
			break;
		}
	}
}
