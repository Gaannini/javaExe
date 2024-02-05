package _14Resolve.first;

public class PrinterMain {
	public static void main(String[] args) {
//		Printer pt = new Printer("samsung", "sj-001", "USB", 5, 100);
//		pt.StartPrint();

		InkjetPrinter inkpt = new InkjetPrinter("LG", "sj-001", "USB", 15, 30, 100);
		inkpt.StartPrint();

		RaserPrinter rspt = new RaserPrinter("Apple", "sj-003", "paraller port", 10, 30, 30);
		rspt.StartPrint();

		// 용지부족
		RaserPrinter rspt1 = new RaserPrinter("Apple", "sj-003", "paraller port", 15, 10, 40);
		rspt1.StartPrint();
	}

}
