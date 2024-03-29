package _01thread.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		// Worker 스레드 생성 후 -> start() -> run() 실행
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		}); // 작업 스레드 생성

		thread.start(); // 작업 스레드 실행

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
