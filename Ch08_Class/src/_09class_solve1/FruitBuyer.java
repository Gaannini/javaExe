package _09class_solve1;

public class FruitBuyer {
	private int money;// 남은돈
	private int numOfApple;// 사과 개수

	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}

	public void buyApple(int money) {
		this.numOfApple = money / 1000;
		this.money -= money;
	}

	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApple);
	}

}