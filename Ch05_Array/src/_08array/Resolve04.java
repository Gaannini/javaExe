//정수 배열 5개를 할당하고 오름차순 배열
package _08array;

import java.util.Arrays;

public class Resolve04 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 1, 6 };
		int index;
		int temp;
		System.out.println("원래 배열 : " + Arrays.toString(arr));

		// 삽입정렬
		for (int i = 1; i < arr.length; i++) {
			index = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (index < arr[j]) {
					temp = index;
					index = arr[j];
					arr[j] = temp;
				} else
					break;
			}
		}
		System.out.println("배열 정렬 : " + Arrays.toString(arr));
	}
}
