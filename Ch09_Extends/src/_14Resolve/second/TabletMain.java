package _14Resolve.second;

import _14Resolve.second.factory.LG;
import _14Resolve.second.factory.Samsung;
import _14Resolve.second.factory.Sony;
import _14Resolve.second.order.TabletTester;

public class TabletMain {

	public static void main(String[] args) throws InterruptedException {
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] { new Samsung(), new Sony(), new LG() };
		int[] score = new int[tabletArr.length];

		for (int i = 0; i < tabletArr.length; i++) {
			int ShowScore;
			tabletTester.setTablet(tabletArr[i]);

			ShowScore = tabletTester.movieTest();
			score[i] += ShowScore;
			System.out.println(tabletArr[i].getClass().getSimpleName() + "Tablet의 Movie 테스트 점수는 " + ShowScore + "입니다.");
			ShowScore = tabletTester.musicTest();
			score[i] += ShowScore;
			System.out.println(tabletArr[i].getClass().getSimpleName() + "Tablet의 Music 테스트 점수는 " + ShowScore + "입니다.");
			ShowScore = tabletTester.ReadBookTest();
			score[i] += ShowScore;
			System.out.println(
					tabletArr[i].getClass().getSimpleName() + "Tablet의 ReadBook 테스트 점수는 " + ShowScore + "입니다.");

			System.out.printf(tabletArr[i].getClass().getSimpleName() + "Tablet의 전 테스트 점수는 %d입니다. \n", score[i]);
			System.out.println("----------------------");
		}

		// 가장 높은 점수를 받은 Tablet
		int max = score[0];
		int maxIdx = 0;
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}

		System.out.println("총합 가장 높은 점수를 받은 Tablet은 " + tabletArr[maxIdx].getClass().getSimpleName() + "이고, ");
		System.out.println(score[maxIdx] + "점입니다.");
	}
}
