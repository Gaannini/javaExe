package _07resolve3;

import java.util.Arrays;

public class ArrayUtilityMain {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr1));

		double[] arr1_todouble = ArrayUtility.intToDouble(arr1);
		System.out.println(Arrays.toString(arr1_todouble));

		System.out.println();

		double[] arr2 = { 2.3, 3.9, 4.1, 5.5, 7.9, 8.1 };
		System.out.println(Arrays.toString(arr2));

		int[] arr2_toint = ArrayUtility.doubleToInt(arr2);
		System.out.println(Arrays.toString(arr2_toint));
	}

}
