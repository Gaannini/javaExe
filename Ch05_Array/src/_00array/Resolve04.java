/*
    int배열을 10개 생성하세요.
	int배열에 3의 배수를 차례대로 저장하세요.
	그리고 거꾸로 출력하세요.
 */
package _00array;

public class Resolve04 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 1; i <= arr.length; i++)
			arr[i - 1] = i * 3;

		for (int j = arr.length - 1; j >= 0; j--)
			System.out.print(arr[j] + " ");
	}
}
