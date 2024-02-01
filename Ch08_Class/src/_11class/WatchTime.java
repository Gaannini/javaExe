package _11class;

public class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	private boolean isNum = true;

	public WatchTime(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.isNum = true;
	}

	public WatchTime(String strHour, String strMin, String strSec) {
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
		this.isNum = false;
	}

	public void viewTime() {
		if (isNum)
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
		else
			System.out.printf("- %s %s %s -\n", strHour, strMin, strSec);
	}

	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum:" + wtNum);
		System.out.printf("wtNum:%x\n", wtNum.hashCode());
		wtNum.viewTime();

		WatchTime wtStr = new WatchTime("열두시", "이십분", "오십초");
		System.out.println("wtStr:" + wtStr);
		System.out.printf("wtStr:%x\n", wtStr.hashCode());
		wtStr.viewTime();
	}
}
