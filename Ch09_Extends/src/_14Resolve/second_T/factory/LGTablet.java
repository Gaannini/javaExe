package _14Resolve.second_T.factory;

import _14Resolve.second_T.ITablet;

public class LGTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet - 영화화면이 미려하다");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LgTablet - 음질이 매우 풍부하다");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LgTablet - 해상도가 뛰어나 선명하다");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}
}
