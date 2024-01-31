package _09class_solve3;

public class Martseller {
	int Fruit_price = 2500;
	int Fruit_num;
	int SaleMoney;

	public Martseller(int Fruit_num) {
		this.Fruit_num = Fruit_num;
	}

	public void sell_Fruit(int num) {
		this.Fruit_num -= num;
		this.SaleMoney += num * Fruit_price;
		showSaleResult();
	}

	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + Fruit_num);
		System.out.println("판매 수익 : " + SaleMoney);
		System.out.println();
	}
}
