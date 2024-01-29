//String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
package _00array;

public class Resolve02 {
	public static void main(String[] args) {
		String arr[] = { "가", "나", "다", "라", "마", "바", "사", "아", "자", "차" };
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + " ");
	}
}
