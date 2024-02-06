package _14Resolve.first_T;

public class Printer {
	protected String modelName;// 모델이름
	protected String manufacturer;// 제조사
	protected P_INTERFACE pInterface;// 인터페이스 종류
	protected int printCount;// 인쇄매수
	protected int paperRemains;// 종이잔량

	public Printer(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount, int paperRemain) {
		super();
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.pInterface = pInterface;
		this.printCount = printCount;
		this.paperRemains = paperRemain;
	}

	public void print() {
		System.out.println("");
		this.paperRemains--;
	}

}
