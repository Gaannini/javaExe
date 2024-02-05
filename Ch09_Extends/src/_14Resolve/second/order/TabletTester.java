package _14Resolve.second.order;

import _14Resolve.second.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3; // 테스트 진행할 횟수
	private ITablet tablet;

	// 외부에서 주입
	// Tablet는 ITablet에 의존적이다.
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}

	public TabletTester() {

	}

	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}

	// 영화 테스트
	public int movieTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.movie();
		}
		return (int) (Math.random() * 100);
	}

	// 음악테스트
	public int musicTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.music();
		}
		return (int) (Math.random() * 100);
	}

	// 책읽기 테스트
	public int ReadBookTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.readBook();
		}
		return (int) (Math.random() * 100);
	}

}
