package _07resolve5;

public class MarbleMain {

	public static void main(String[] args) {
		KidGame firstgame = new KidGame(15, 9);

		// 1차 놀이에서 어린이1은 어린이2의 구슬 2개를 획득한다
		firstgame.MarbleGame(firstgame, 1, 2);
		// 2차 놀이에서 어린이2는 어린이 1의 구슬 7개를 획득한다
		firstgame.MarbleGame(firstgame, 2, 7);
		// 게임종료
		firstgame.End();
	}

}
