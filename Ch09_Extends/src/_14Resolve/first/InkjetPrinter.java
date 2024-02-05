package _14Resolve.first;

public class InkjetPrinter extends Printer {
	int NumOfInk;

	public InkjetPrinter(String model, String maker, String type, int numofprint, int amount, int numofink) {
		super(model, maker, type, numofprint, amount);
		this.NumOfInk = numofink;
	}

	@Override
	public void Print() {
		super.Print();
		NumOfInk--;
	}

	@Override
	public void EndPrint() {
		super.EndPrint();
		System.out.println("남은 잉크 : " + NumOfInk);
		System.out.println();
	}
}
