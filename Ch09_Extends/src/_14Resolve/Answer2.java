package _14Resolve;

import java.util.Scanner;

import _14Resolve.second_T.ITablet;
import _14Resolve.second_T.factory.LGTablet;
import _14Resolve.second_T.factory.LenovoTablet;
import _14Resolve.second_T.factory.SamsungTablet;
import _14Resolve.second_T.order.TabletTester;

public class Answer2 implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "2. ITablet 인터페이스를 만드세요.\n" + "   아래 메서드를 멤버로 추가하세요.\n" + "   void movie();\n"
				+ "   void music();\n" + "   void readBook();\n" + "   \n"
				+ "   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\n" + "   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\n"
				+ "   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.\n\n";

		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		sc.nextLine(); // Enter치기 전까지 멈춰 있음
		System.out.println("2번 문제 실행~");

		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] { new SamsungTablet(), new LGTablet(), new LenovoTablet() };
		int[] score = new int[tabletArr.length];

		for (int i = 0; i < tabletArr.length; i++) {
			tabletTester.setTablet(tabletArr[i]);

			int movie = 0, music = 0, readBook = 0;
			try {
				movie = tabletTester.movieTest();
				System.out.printf("---movie 테스트 점수는 %d입니다\n", movie);
				music = tabletTester.musicTest();
				System.out.printf("---music 테스트 점수는 %d입니다\n", music);
				readBook = tabletTester.readBookTest();
				System.out.printf("---readBook 테스트 점수는 %d입니다\n", readBook);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			score[i] = movie + music + readBook;

			System.out.printf("===>전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("---------------------------------------");
		}

		// 가장 큰 점수를 받은 값과 인덱스 찾기
		int max = score[0];
		int maxIdx = 0;
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}

		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 태블릿이고 점수는 %d입니다\n", maxIdx + 1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName());

		sc.nextLine(); // Enter치기 전까지 멈춰 있음

	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return true;
	}
}
