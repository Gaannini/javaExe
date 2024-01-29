package _08array;

import java.util.Arrays;

public class Resolve02 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 1, 6 };
		int min;

		// 선택정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				} else
					continue;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("최소값 : " + arr[0]);
		System.out.println("최대값 : " + arr[arr.length - 1]);
	}
}
