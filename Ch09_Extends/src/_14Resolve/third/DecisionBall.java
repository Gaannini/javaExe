package _14Resolve.third;

import java.util.Scanner;

//스트라이크, 볼을 판단하는 역할
public class DecisionBall {
	static Scanner sc = new Scanner(System.in);
	static int Strike = 0;
	static int ball = 0;

	static BaseBallMenu replay = new BaseBallMenu();

	public static void DecisionBall(int[] randomNums, int[] playerNums) {
		Strike = 0;
		ball = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < playerNums.length; i++) {
			for (int j = 0; j < randomNums.length; j++) {
				if (i == j && playerNums[i] == randomNums[j]) {
					Strike++;
				}
				if (i != j && playerNums[i] == randomNums[j]) {
					ball++;
				} else {
					continue;
				}
			}
		}
		System.out.println("===> " + Strike + "스트라이크" + ball + "볼");
		if (Strike == 3) {
			System.out.println("===> 삼진아웃!!");
			System.out.print("다시하시겠습니까(Y/N)?");
			String ReStart = sc.next();
			if (ReStart.equals("Y")) {
				replay.GameStart();
			} else {
				System.out.println("게임 종료");
				System.exit(0);
			}
		}
	}

}
