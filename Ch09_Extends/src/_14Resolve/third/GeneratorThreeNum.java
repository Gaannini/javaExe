package _14Resolve.third;

import java.util.Random;

//난수 3개를 생성하는 역할
public class GeneratorThreeNum {

	public static int[] GeneratorThreeNum(int[] arr) {
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(9); // 0~9까지의 난수
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		return arr;
	}
}
