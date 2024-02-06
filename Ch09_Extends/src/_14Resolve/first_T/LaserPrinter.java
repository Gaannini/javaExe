package _14Resolve.first_T;

public class LaserPrinter extends Printer {
	protected double TonerRemainders;

	public LaserPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount, int paperRemain,
			double TonerRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemain);
		this.TonerRemainders = TonerRemainders;
	}

	@Override
	public void print() {
		super.print();
		this.printCount++;
		this.TonerRemainders -= 0.1;
		System.out.println("빠르게 출력된다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [TonerRemainders=" + TonerRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
}
