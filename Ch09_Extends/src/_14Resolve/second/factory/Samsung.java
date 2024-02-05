package _14Resolve.second.factory;

import _14Resolve.second.ITablet;

public class Samsung implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("Samsung : 영화재생중 ...");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("Samsung : 음악재생중 ...");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Samsung : 책읽어주기 ...");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}
}
