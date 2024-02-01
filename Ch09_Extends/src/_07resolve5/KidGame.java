package _07resolve5;

public class KidGame {
	int marblenum_1; // 첫번째어린이가 가지고 있는 구슬 개수
	int marblenum_2; // 첫번째어린이가 가지고 있는 구슬 개수

	// 1) 어린아이가 가지고 있는 구슬 개수 정보를 담을 수 있다
	public KidGame(int marblenum_1, int marblenum_2) {
		System.out.println("------- 놀이 시작 -------");
		this.marblenum_1 = marblenum_1;
		this.marblenum_2 = marblenum_2;
		MarbalPrint();
	}

	// 2) 놀이를 통한 구슬의 주고받음을 표현하는 메소드가 존재한다
	// kids = 게임진행하는 객체(어린이들)
	// winner = 이긴 어린이, num = 획득한 구슬개수
	public void MarbleGame(KidGame kids, int winner, int num) {
		switch (winner) {
		case 1:
			System.out.println("어린이1은 구슬 " + num + "개를 획득했습니다.");
			kids.marblenum_1 += num;
			kids.marblenum_2 -= num;
			kids.MarbalPrint();
			break;
		case 2:
			System.out.println("어린이2은 구슬 " + num + "개를 획득했습니다.");
			kids.marblenum_1 -= num;
			kids.marblenum_2 += num;
			kids.MarbalPrint();
			break;
		default:
			System.out.println("게임종료");
		}
	}

	// 3) 어린이의 현재 구슬 개수를 출력하는 메소드가 존재한다.
	public void MarbalPrint() {
		System.out.println("어린이1의 구슬 개수 : " + marblenum_1 + "개");
		System.out.println("어린이2의 구슬 개수 : " + marblenum_2 + "개");
		System.out.println();
	}

	public void End() {
		System.out.println("놀이가 끝났습니다.");
	}

}
