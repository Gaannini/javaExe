package _08hasa;

public class Gun {
	private int bullet;

	public Gun(int bullet) {
		this.bullet = bullet;
	}

	public void shot() {
		if (bullet > 0) {
			System.out.println("BBBANG!");
			bullet--;
		} else {
			System.out.println("Chulkuk");
		}
	}

}
