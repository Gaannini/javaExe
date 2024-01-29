//정수 배열 5개를 할당하고 배열을 출력했을 때 거꾸로 출력되도록 배열의 값을 거꾸로 저장하세요.

package _08array;

import java.util.Arrays;

public class Resolve03 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 1, 6, 0, 7 };
		int temp = 0;
		System.out.println("원래 배열 : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("배열 정렬(오름차순) : " + Arrays.toString(arr));

		for (int i = 1; i <= arr.length / 2; i++) {
			temp = arr[i - 1];
			arr[i - 1] = arr[arr.length - i];
			arr[arr.length - i] = temp;
		}
		System.out.println("배열 정렬(내림차순) : " + Arrays.toString(arr));
	}
}
