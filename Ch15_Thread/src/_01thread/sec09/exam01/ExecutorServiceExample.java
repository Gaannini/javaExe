package _01thread.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		// 스레드폴 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		// 작업 생성과 처리 요청
		// 스레드폴 종료
		executorService.shutdownNow();
	}
}
