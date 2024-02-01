package _07resolve4;

import java.util.Arrays;

public class ArrayUtilityMain2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10, 11, 12 };

		System.out.println("배열1 > " + Arrays.toString(arr1));
		System.out.println("배열2 > " + Arrays.toString(arr2));
		System.out.println();

		int[] arr1_todouble = ArrayUtility2.concat(arr1, arr2);
		System.out.println("----배열1과 배열2 연결------");
		System.out.println(Arrays.toString(arr1_todouble));
	}
}
