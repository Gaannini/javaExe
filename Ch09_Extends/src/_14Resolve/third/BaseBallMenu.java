package _14Resolve.third;

import java.util.Scanner;

//메뉴를 담당하는 역할
public class BaseBallMenu {
	Scanner sc = new Scanner(System.in);

	int MenuNum; // 메뉴번호
	int[] RandomNums = new int[3]; // 게임에 사용 숫자들을 저장하는 배열
	int[] PlayerNums = new int[3];// 플레이어가 작성한 숫자들

	public void run() {
		Menu();
	}

	public void Menu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 게임 시작하기");
		System.out.println("2. 나가기");
		System.out.print("선택 >> ");
		MenuNum = sc.nextInt();

		switch (MenuNum) {
		case 1:
			GameStart();
			break;
		case 2:
			System.out.println("게임이 종료되었습니다.");
			System.exit(0);
			break;
		}
	}

	public void GameStart() {
		System.out.println();
		System.out.println("----게임을 시작합니다.----");

		RandomNums = GeneratorThreeNum.GeneratorThreeNum(RandomNums);
		// System.out.println(Arrays.toString(RandomNums));배열 답 확인
		while (true)
			PlayGame();
	}

	public void PlayGame() {
		for (int i = 1; i <= PlayerNums.length; i++) {
			System.out.print(i + "번째 숫자 입력 >> ");
			PlayerNums[i - 1] = sc.nextInt();
		}
		DecisionBall.DecisionBall(RandomNums, PlayerNums);
		System.out.println();
	}
}
