package _09class_solve3;

public class Martbuyer {
	int Fruit_num;
	int Changes; // 거스름돈

	Martbuyer(int money) {
		this.Fruit_num = 0;
	}

	// giveMoney = 지불한 돈, num = 사려고하는 과일개수
	public void Buy_Fruit(Martseller seller, int giveMoney, int num) {
		this.Changes = giveMoney - (seller.Fruit_price * num);
		this.Fruit_num += num;

		showBuyResult(num, giveMoney);
		seller.sell_Fruit(num);
	}

	public void showBuyResult(int num, int giveMoney) {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("지불한돈  	    : " + giveMoney);
		System.out.println("구입할 과일의 개수 : " + num);
		System.out.println("거스름돈  	    : " + Changes);
		System.out.println("과일 개수	    : " + Fruit_num);
		System.out.println();
	}
}
