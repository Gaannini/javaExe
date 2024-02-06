package _14Resolve.first;

public class LaserPrinter extends Printer {
	int NumofToner;

	public LaserPrinter(String model, String maker, String type, int numofprint, int amount, int numoftoner) {
		super(model, maker, type, numofprint, amount);
		this.NumofToner = numoftoner;
	}

	@Override
	public void Print() {
		super.Print();
		NumofToner--;

	}

	@Override
	public void EndPrint() {
		super.EndPrint();
		System.out.println("남은 토너 : " + NumofToner);
		System.out.println();
	}

}
