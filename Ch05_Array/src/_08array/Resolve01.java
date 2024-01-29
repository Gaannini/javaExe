package _08array;

import java.util.Arrays;

public class Resolve01 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 1, 6 };

		// 정렬
		Arrays.sort(arr);

		System.out.println("최소값 : " + arr[0]);
		System.out.println("최대값 : " + arr[arr.length - 1]);
	}
}
