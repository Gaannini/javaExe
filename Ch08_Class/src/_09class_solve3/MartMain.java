package _09class_solve3;

public class MartMain {
	public static void main(String[] args) {
		Martbuyer buyer = new Martbuyer(5000);
		Martseller seller = new Martseller(10);

		seller.showSaleResult();

		buyer.Buy_Fruit(seller, 5000, 1);

		buyer.Buy_Fruit(seller, 10000, 3);
	}
}
