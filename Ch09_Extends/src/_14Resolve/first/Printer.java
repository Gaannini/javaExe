package _14Resolve.first;

public class Printer {
	String Model; // 모델명
	String Maker; // 제조사
	String Type; // 인터페이스 종류
	int NumOfPrint; // 인쇄매수
	int Amount; // 인쇄 용지 잔량

	public Printer(String model, String maker, String type, int numofprint, int amount) {
		this.Model = model;
		this.Maker = maker;
		this.Type = type;
		this.NumOfPrint = numofprint;
		this.Amount = amount;
	}

	public void Print() {
		System.out.println("인쇄중입니다...");
		Amount--;
	}

	public void StartPrint() {
		System.out.println(Model + "(" + Maker + ") - " + Type); // 모델명(제조사) - 인터페이스 종류
		System.out.println("현재 인쇄 용지 : " + Amount);
		System.out.println("-----인쇄를 시작합니다.-----");

		Printing();
	}

	public void Printing() {
		for (; NumOfPrint > 0; NumOfPrint--) {
			if (Amount > 0)
				Print();
			else {
				System.out.println("인쇄용지가 부족하여 인쇄를 종료합니다.");
				System.out.println();
				break;
			}
		}
		if (NumOfPrint == 0) {
			EndPrint();
		}
	}

	public void EndPrint() {
		System.out.println("인쇄가 완료되었습니다.");
		System.out.println("남은인쇄용지 : " + Amount);
	}
}
