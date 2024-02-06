package _14Resolve.first_T;

public class InkJetPrinter extends Printer {
	protected double inkRemainders;

	public InkJetPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount, int paperRemain,
			double inkRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemain);
		this.inkRemainders = inkRemainders;
	}

	@Override
	public void print() {
		super.print();
		this.printCount++;
		this.inkRemainders -= 0.1;
		System.out.println("잉크가 잘 분사되어 출력된다.");
	}

	@Override
	public String toString() {
		return "InkJetPrinter [inkRemainders=" + inkRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
}
