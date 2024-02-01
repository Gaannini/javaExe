package _07resolve3;

public class ArrayUtility {

	// int배열을 double배열로 변환
	static double[] intToDouble(int[] source) {
		double[] source_double = new double[source.length];
		for (int i = 0; i < source.length; i++)
			source_double[i] = (double) source[i];
		return source_double;

	};

	// double배열을 int배열로 변환
	static int[] doubleToInt(double[] source) {
		int[] source_int = new int[source.length];
		for (int i = 0; i < source.length; i++)
			source_int[i] = (int) Math.round(source[i]);
		return source_int;
	};

}
