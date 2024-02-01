package _03extend;

public class Father extends GrandFather {

	long money = 10000000000000000L;

	Father() {
		System.out.println("Father 생성자");
	}

	void wealth() {
		System.out.println("돈을 많이 벌었다ㅎㅎ");
	}
}
