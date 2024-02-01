package _09class_solve1;

public class FruitBuyer {
	private int money;// 남은돈
	private int numOfApple;// 사과 개수
	final int APPLE_PRICE = 1000; // 사과가격

	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}

	public int buyApple(int _money) {
		int num = _money / APPLE_PRICE;
		this.numOfApple += num;
		this.money -= _money;
		return num;
	}

	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApple);
	}

}
