package _14Resolve.second.factory;

import _14Resolve.second.ITablet;

public class LG implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LG : 영화재생중 ...");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LG : 음악재생중 ...");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LG : 책읽어주기 ...");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}
}
